package nm;

/* loaded from: classes.dex */
public enum x extends z {
    public x(String str, int i13) {
        super(str, i13, null);
    }

    @Override // nm.z
    public s serialize(Long l13) {
        return l13 == null ? t.f91365a : new v(l13);
    }
}
