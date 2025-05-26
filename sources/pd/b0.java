package pd;

/* loaded from: classes3.dex */
public final class b0 implements Appendable {

    /* renamed from: a, reason: collision with root package name */
    public final Appendable f99635a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f99636b = true;

    public b0(Appendable appendable) {
        this.f99635a = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i13, int i14) {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z13 = this.f99636b;
        Appendable appendable = this.f99635a;
        boolean z14 = false;
        if (z13) {
            this.f99636b = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i14 - 1) == '\n') {
            z14 = true;
        }
        this.f99636b = z14;
        appendable.append(charSequence, i13, i14);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c13) {
        boolean z13 = this.f99636b;
        Appendable appendable = this.f99635a;
        if (z13) {
            this.f99636b = false;
            appendable.append("  ");
        }
        this.f99636b = c13 == '\n';
        appendable.append(c13);
        return this;
    }
}
