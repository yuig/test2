package en1;

import android.content.res.TypedArray;
import com.pinterest.gestalt.searchGuide.GestaltSearchGuide;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f59648i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltSearchGuide f59649j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(GestaltSearchGuide gestaltSearchGuide, int i13) {
        super(1);
        this.f59648i = i13;
        this.f59649j = gestaltSearchGuide;
    }

    public final gm1.c b(Unit it) {
        int i13 = this.f59648i;
        GestaltSearchGuide gestaltSearchGuide = this.f59649j;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return new i0(((d) ((u50.o) gestaltSearchGuide.f49545a.f33803a)).f59661i);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return new j0(((d) ((u50.o) gestaltSearchGuide.f49545a.f33803a)).f59661i);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f59648i;
        GestaltSearchGuide gestaltSearchGuide = this.f59649j;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                fm1.c cVar = GestaltSearchGuide.f49543l;
                gestaltSearchGuide.getClass();
                String string = $receiver.getString(o0.GestaltSearchGuide_android_text);
                if (string == null) {
                    string = "";
                }
                u50.f0 h23 = bs1.c.h2(string);
                String string2 = $receiver.getString(o0.GestaltSearchGuide_android_contentDescription);
                break;
            case 1:
                d it = (d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                fm1.c cVar2 = GestaltSearchGuide.f49543l;
                gestaltSearchGuide.f(it);
                break;
            case 2:
                Intrinsics.checkNotNullParameter((gm1.a) obj, "it");
                fm1.c cVar3 = GestaltSearchGuide.f49543l;
                gestaltSearchGuide.getClass();
                a aVar = new a(gestaltSearchGuide, 3);
                com.google.firebase.messaging.q qVar = gestaltSearchGuide.f49545a;
                qVar.F(im1.m.f72668n, aVar);
                qVar.I(im1.m.f72670p, new a(gestaltSearchGuide, 4));
                break;
        }
        return b((Unit) obj);
    }
}
