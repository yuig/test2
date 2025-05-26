package h6;

import android.text.Spannable;
import android.text.SpannableString;

/* loaded from: classes.dex */
public final class t implements u {

    /* renamed from: a, reason: collision with root package name */
    public j0 f67748a;

    /* renamed from: b, reason: collision with root package name */
    public final e3.e f67749b;

    public t(j0 j0Var, e3.e eVar) {
        this.f67748a = j0Var;
        this.f67749b = eVar;
    }

    @Override // h6.u
    public final boolean a(CharSequence charSequence, int i13, int i14, g0 g0Var) {
        if ((g0Var.f67718c & 4) > 0) {
            return true;
        }
        if (this.f67748a == null) {
            this.f67748a = new j0(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        this.f67749b.getClass();
        this.f67748a.setSpan(new h0(g0Var), i13, i14, 33);
        return true;
    }

    @Override // h6.u
    public final Object b() {
        return this.f67748a;
    }
}
