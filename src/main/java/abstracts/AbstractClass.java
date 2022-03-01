package abstracts;

interface HasTail { int getTailLength(); }
public abstract class AbstractClass implements HasTail{
    public int getTailLength() { return 4; }
}
