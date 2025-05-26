package ip;

import cn1.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.z;
import rn1.k;
import u50.f0;
import yl1.l;

/* loaded from: classes3.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f73361i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ CharSequence f73362j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13, CharSequence charSequence) {
        super(1);
        this.f73361i = i13;
        this.f73362j = charSequence;
    }

    public final rn1.a b(rn1.a state) {
        int i13 = this.f73361i;
        CharSequence string = this.f73362j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(state, "state");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(state, "it");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(state, "it");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(state, "it");
                break;
            case 4:
                Intrinsics.checkNotNullParameter(state, "it");
                Intrinsics.checkNotNullParameter(string, "string");
                break;
            case 5:
                Intrinsics.checkNotNullParameter(state, "it");
                Intrinsics.checkNotNullParameter(string, "string");
                break;
            case 6:
                Intrinsics.checkNotNullParameter(state, "it");
                break;
            case 7:
                Intrinsics.checkNotNullParameter(state, "it");
                Intrinsics.checkNotNullParameter(string, "string");
                break;
            case 8:
            case 11:
            case 12:
            case 15:
            case 16:
            case 17:
            default:
                Intrinsics.checkNotNullParameter(state, "it");
                break;
            case 9:
                Intrinsics.checkNotNullParameter(state, "it");
                Intrinsics.checkNotNullExpressionValue(string, "$textValue");
                break;
            case 10:
                Intrinsics.checkNotNullParameter(state, "it");
                break;
            case 13:
                Intrinsics.checkNotNullParameter(state, "it");
                break;
            case 14:
                Intrinsics.checkNotNullParameter(state, "it");
                break;
            case 18:
                Intrinsics.checkNotNullParameter(state, "it");
                break;
            case 19:
                Intrinsics.checkNotNullParameter(state, "it");
                f0 h23 = bs1.c.h2(string != null ? string : "");
                if (string != null && (!z.j(string))) {
                    r3 = true;
                }
                break;
            case 20:
                Intrinsics.checkNotNullParameter(state, "it");
                break;
            case 21:
                Intrinsics.checkNotNullParameter(state, "it");
                break;
            case 22:
                Intrinsics.checkNotNullParameter(state, "it");
                break;
        }
        return rn1.a.y(state, null, null, null, null, null, 0, d7.b.Z(!z.j(string)), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
    }

    public final yl1.b e(yl1.b it) {
        int i13 = this.f73361i;
        CharSequence charSequence = this.f73362j;
        switch (i13) {
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.h2(charSequence.toString()), false, z.j(charSequence) ^ true ? fm1.c.VISIBLE : fm1.c.GONE, null, null, null, null, null, 0, null, 1018);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.h2(charSequence.toString()), false, z.j(charSequence) ^ true ? fm1.c.VISIBLE : fm1.c.GONE, null, null, null, null, null, 0, null, 1018);
        }
    }

    public final void f(k bind) {
        int i13 = this.f73361i;
        CharSequence charSequence = this.f73362j;
        switch (i13) {
            case 15:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f(charSequence);
                bind.f108892g = z.j(charSequence) ^ true ? fm1.c.VISIBLE : fm1.c.GONE;
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f(charSequence);
                bind.f108892g = z.j(charSequence) ^ true ? fm1.c.VISIBLE : fm1.c.GONE;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f73361i;
        CharSequence charSequence = this.f73362j;
        switch (i13) {
            case 8:
                d0 bind = (d0) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(charSequence.toString());
                break;
            case 15:
                f((k) obj);
                break;
            case 16:
                f((k) obj);
                break;
            case 17:
                l bind2 = (l) obj;
                Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                bind2.d(charSequence);
                break;
        }
        return b((rn1.a) obj);
    }
}
