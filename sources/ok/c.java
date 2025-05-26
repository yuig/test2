package ok;

/* loaded from: classes3.dex */
public enum c extends i {
    public c(String str, int i13, p pVar, String str2) {
        super(str, i13, pVar, str2, null);
    }

    @Override // ok.i
    public String convert(i iVar, String str) {
        return iVar == i.LOWER_UNDERSCORE ? str.replace('-', '_') : iVar == i.UPPER_UNDERSCORE ? com.bumptech.glide.c.r1(str.replace('-', '_')) : super.convert(iVar, str);
    }

    @Override // ok.i
    public String normalizeWord(String str) {
        return com.bumptech.glide.c.q1(str);
    }
}
