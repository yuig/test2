package qm1;

import android.content.res.TypedArray;
import com.pinterest.gestalt.iconbuttonfloating.GestaltIconButtonFloating;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rm1.q;
import rm1.r;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f104380i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltIconButtonFloating f104381j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(GestaltIconButtonFloating gestaltIconButtonFloating, int i13) {
        super(1);
        this.f104380i = i13;
        this.f104381j = gestaltIconButtonFloating;
    }

    public final gm1.c b(Unit it) {
        int i13 = this.f104380i;
        GestaltIconButtonFloating gestaltIconButtonFloating = this.f104381j;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return new i(gestaltIconButtonFloating.getId());
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return new j(gestaltIconButtonFloating.getId());
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f104380i;
        GestaltIconButtonFloating gestaltIconButtonFloating = this.f104381j;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                q qVar = GestaltIconButtonFloating.f49395f;
                gestaltIconButtonFloating.getClass();
                q a13 = r.a($receiver, n.GestaltIconButtonFloating_gestalt_iconButtonFloatingIcon, GestaltIconButtonFloating.f49395f);
                int i14 = $receiver.getInt(n.GestaltIconButtonFloating_gestalt_iconButtonFloatingSelected, -1);
                break;
            case 1:
                Intrinsics.checkNotNullParameter((gm1.a) obj, "it");
                q qVar2 = GestaltIconButtonFloating.f49395f;
                gestaltIconButtonFloating.getClass();
                a aVar = new a(gestaltIconButtonFloating, 3);
                com.google.firebase.messaging.q qVar3 = gestaltIconButtonFloating.f49399e;
                qVar3.F(im1.m.f72668n, aVar);
                qVar3.I(im1.m.f72670p, new a(gestaltIconButtonFloating, 4));
                break;
            case 2:
                fm1.c it = (fm1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                gestaltIconButtonFloating.setVisibility(it.getVisibility());
                break;
        }
        return b((Unit) obj);
    }
}
