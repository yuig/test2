package d4;

/* loaded from: classes3.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f53676a;

    /* renamed from: b, reason: collision with root package name */
    public final g f53677b;

    public h(CharSequence charSequence, g gVar) {
        this.f53676a = charSequence;
        this.f53677b = gVar;
    }

    @Override // d4.f
    public final int a(int i13) {
        CharSequence charSequence;
        do {
            g gVar = this.f53677b;
            gVar.a(i13);
            i13 = gVar.f53675d.following(i13);
            if (i13 != -1) {
                charSequence = this.f53676a;
                if (i13 == charSequence.length()) {
                }
            }
            return -1;
        } while (Character.isWhitespace(charSequence.charAt(i13)));
        return i13;
    }

    @Override // d4.f
    public final int b(int i13) {
        do {
            g gVar = this.f53677b;
            gVar.a(i13);
            i13 = gVar.f53675d.preceding(i13);
            if (i13 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f53676a.charAt(i13)));
        return i13;
    }

    @Override // d4.f
    public final int c(int i13) {
        do {
            g gVar = this.f53677b;
            gVar.a(i13);
            i13 = gVar.f53675d.following(i13);
            if (i13 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f53676a.charAt(i13 - 1)));
        return i13;
    }

    @Override // d4.f
    public final int e(int i13) {
        do {
            g gVar = this.f53677b;
            gVar.a(i13);
            i13 = gVar.f53675d.preceding(i13);
            if (i13 == -1 || i13 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.f53676a.charAt(i13 - 1)));
        return i13;
    }
}
