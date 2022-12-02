package books.jenkins

class Randomword {

    private pipelineSteps
    private List<String> mots
    private Random random

    public Randomword(pipelineSteps) {
        this.pipelineSteps = pipelineSteps
        this.mots = this.readResourceAsList('mots.txt')
        this.random = new SecureRandom()
    }

    String get() {
        int wordIndex = this.random.nextInt(this.mots.size())
        String capitalized = org.apache.commons.lang.WordUtils.capitalizeFully(this.mots[wordIndex])
        return capitalized
    }

    @NonCPS
    private List readResourceAsList(String name) {
        String resource = this.pipelineSteps.libraryResource(name)
        return resource.split()
    }
}