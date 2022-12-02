import books.jenkins.Randomword

void echo() {
    Randomword rw = new Randomword(this)
    echo rw.get()
}
