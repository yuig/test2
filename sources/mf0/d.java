package mf0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87092i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f87093j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(f fVar, int i13) {
        super(1);
        this.f87092i = i13;
        this.f87093j = fVar;
    }

    public final rn1.a b(rn1.a state) {
        int i13 = this.f87092i;
        f fVar = this.f87093j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(state, "state");
                CharSequence charSequence = fVar.O;
                if (charSequence == null) {
                    charSequence = "";
                }
                return rn1.a.y(state, bs1.c.h2(charSequence), null, null, null, null, 0, null, rn1.b.END, null, null, false, 0, null, null, null, null, null, false, null, null, 2097022);
            case 3:
                Intrinsics.checkNotNullParameter(state, "it");
                return rn1.a.y(state, bs1.c.h2(String.valueOf(fVar.N)), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            default:
                Intrinsics.checkNotNullParameter(state, "it");
                int i14 = f.f87095b0;
                fVar.getClass();
                return rn1.a.y(state, bs1.c.h2("null"), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
        }
    }

    public final yl1.b e(yl1.b it) {
        int i13 = this.f87092i;
        f fVar = this.f87093j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                String str = fVar.T;
                return yl1.b.f(it, bs1.c.h2(str != null ? str : ""), false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1018);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                String str2 = fVar.R;
                return yl1.b.f(it, bs1.c.h2(str2 != null ? str2 : ""), false, fm1.c.VISIBLE, null, null, null, null, null, 0, null, 1018);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f87092i) {
            case 0:
                return b((rn1.a) obj);
            case 1:
                return e((yl1.b) obj);
            case 2:
                return e((yl1.b) obj);
            default:
                return b((rn1.a) obj);
        }
    }
}
