package p11;

import com.pinterest.gestalt.text.GestaltText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f98679i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltText f98680j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(GestaltText gestaltText, int i13) {
        super(1);
        this.f98679i = i13;
        this.f98680j = gestaltText;
    }

    public final gm1.c b(Unit it) {
        int i13 = this.f98679i;
        GestaltText gestaltText = this.f98680j;
        switch (i13) {
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return new rn1.f(gestaltText.getId());
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return new rn1.h(gestaltText.getId());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c4  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r50) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p11.r.invoke(java.lang.Object):java.lang.Object");
    }
}
