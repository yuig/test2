package g1;

import kotlin.collections.u0;

/* loaded from: classes2.dex */
public final class r0 extends u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63311a;

    /* renamed from: b, reason: collision with root package name */
    public int f63312b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f63313c;

    public r0(p0 p0Var, int i13) {
        this.f63311a = i13;
        this.f63313c = p0Var;
    }

    @Override // kotlin.collections.u0
    public final int b() {
        int i13 = this.f63311a;
        Object obj = this.f63313c;
        switch (i13) {
            case 0:
                int i14 = this.f63312b;
                this.f63312b = i14 + 1;
                return ((p0) obj).i(i14);
            default:
                int codePointAt = ((String) obj).codePointAt(this.f63312b);
                this.f63312b = Character.charCount(codePointAt) + this.f63312b;
                return codePointAt;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i13 = this.f63311a;
        Object obj = this.f63313c;
        switch (i13) {
            case 0:
                if (this.f63312b < ((p0) obj).k()) {
                    break;
                }
                break;
            default:
                if (this.f63312b < ((String) obj).length()) {
                    break;
                }
                break;
        }
        return true;
    }
}
