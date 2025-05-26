package rl1;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f108645i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltAvatar f108646j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(GestaltAvatar gestaltAvatar, int i13) {
        super(1);
        this.f108645i = i13;
        this.f108646j = gestaltAvatar;
    }

    public final gm1.c b(Unit it) {
        int i13 = this.f108645i;
        GestaltAvatar gestaltAvatar = this.f108646j;
        switch (i13) {
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return new t(gestaltAvatar.O2().f108655i);
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return new z(gestaltAvatar.O2().f108655i);
            case 6:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return new x(gestaltAvatar.O2().f108655i);
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return new w(gestaltAvatar.O2().f108655i);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f108645i;
        GestaltAvatar gestaltAvatar = this.f108646j;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                ps0.m mVar = GestaltAvatar.L;
                gestaltAvatar.getClass();
                int i14 = $receiver.getInt(l0.GestaltAvatar_gestalt_avatarSize, -1);
                r rVar = i14 >= 0 ? r.values()[i14] : GestaltAvatar.M;
                boolean z13 = $receiver.getBoolean(l0.GestaltAvatar_gestalt_showBorder, true);
                int i15 = l0.GestaltAvatar_android_contentDescription;
                Intrinsics.checkNotNullParameter($receiver, "<this>");
                String string = $receiver.getString(i15);
                return new q((String) null, (String) null, z13, rVar, string != null ? new u50.f0(string) : u50.h0.f120562a, $receiver.getBoolean(l0.GestaltAvatar_gestalt_showOverlayOnWhite, true), d7.b.Y($receiver, l0.GestaltAvatar_android_visibility, l.f108629f), 0, (c) null, com.bumptech.glide.c.N($receiver, l0.GestaltAvatar_android_importantForAccessibility), 835);
            case 1:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ps0.m mVar2 = GestaltAvatar.L;
                gestaltAvatar.K.r(gestaltAvatar.R2());
                return Unit.f80348a;
            case 2:
                gm1.a it2 = (gm1.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                ps0.m mVar3 = GestaltAvatar.L;
                gestaltAvatar.getClass();
                p pVar = new p(gestaltAvatar, 4);
                com.google.firebase.messaging.q qVar = gestaltAvatar.f49249J;
                qVar.F(im1.m.f72668n, pVar);
                qVar.I(im1.m.f72670p, new p(gestaltAvatar, 5));
                i iVar = new i(gestaltAvatar, 1);
                p superSetImageListener = new p(gestaltAvatar, 9);
                k kVar = gestaltAvatar.K;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(superSetImageListener, "superSetImageListener");
                superSetImageListener.invoke(new j(kVar, iVar));
                return Unit.f80348a;
            case 3:
                Canvas canvas = (Canvas) obj;
                switch (i13) {
                    case 3:
                        Intrinsics.checkNotNullParameter(canvas, "canvas");
                        super/*android.view.View*/.dispatchDraw(canvas);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(canvas, "canvas");
                        super/*com.pinterest.ui.imageview.GenericWebImageView*/.onDraw(canvas);
                        break;
                }
                return Unit.f80348a;
            case 4:
                return b((Unit) obj);
            case 5:
                return b((Unit) obj);
            case 6:
                Canvas canvas2 = (Canvas) obj;
                switch (i13) {
                    case 3:
                        Intrinsics.checkNotNullParameter(canvas2, "canvas");
                        super/*android.view.View*/.dispatchDraw(canvas2);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(canvas2, "canvas");
                        super/*com.pinterest.ui.imageview.GenericWebImageView*/.onDraw(canvas2);
                        break;
                }
                return Unit.f80348a;
            case 7:
                return b((Unit) obj);
            case 8:
                return b((Unit) obj);
            default:
                ps0.m mVar4 = GestaltAvatar.L;
                gestaltAvatar.f52564p = (hs1.c) obj;
                return Unit.f80348a;
        }
    }
}
