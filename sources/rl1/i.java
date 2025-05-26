package rl1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.ui.imageview.WebImageView;
import i1.e1;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i extends hs1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f108594b;

    public i(Object obj, int i13) {
        this.f108593a = i13;
        this.f108594b = obj;
    }

    @Override // hs1.c
    public final void a(boolean z13) {
        int i13 = this.f108593a;
        Object obj = this.f108594b;
        switch (i13) {
            case 0:
                k kVar = (k) obj;
                WebImageView webImageView = kVar.f108598a;
                if (webImageView == null) {
                    Intrinsics.r("avatarView");
                    throw null;
                }
                if (kVar.L) {
                    Context context = webImageView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    webImageView.F0(dl2.b.x0(context, eo1.a.comp_avatar_image_wash_overlay));
                }
                int g13 = kVar.g();
                WebImageView webImageView2 = kVar.f108598a;
                if (webImageView2 == null) {
                    Intrinsics.r("avatarView");
                    throw null;
                }
                Drawable drawable = webImageView2.f34152e;
                if (drawable != null) {
                    drawable.setBounds(0, 0, g13, g13);
                    webImageView2.invalidate();
                    return;
                }
                return;
            default:
                GestaltAvatar gestaltAvatar = (GestaltAvatar) obj;
                com.google.firebase.messaging.q qVar = gestaltAvatar.f49249J;
                e1 makeBitmapObtainedEvent = new e1(gestaltAvatar, z13, 4);
                im1.m doOnBitmapObtained = im1.m.f72664j;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(doOnBitmapObtained, "doOnBitmapObtained");
                Intrinsics.checkNotNullParameter(makeBitmapObtainedEvent, "makeBitmapObtainedEvent");
                Unit unit = Unit.f80348a;
                doOnBitmapObtained.invoke(unit);
                qVar.s((gm1.c) makeBitmapObtainedEvent.invoke(unit));
                return;
        }
    }

    @Override // hs1.c
    public final void d() {
        int i13 = this.f108593a;
        int i14 = 1;
        Object obj = this.f108594b;
        switch (i13) {
            case 0:
                k kVar = (k) obj;
                WebImageView webImageView = kVar.f108598a;
                if (webImageView == null) {
                    Intrinsics.r("avatarView");
                    throw null;
                }
                kVar.M = true;
                webImageView.invalidate();
                return;
            default:
                GestaltAvatar gestaltAvatar = (GestaltAvatar) obj;
                com.google.firebase.messaging.q qVar = gestaltAvatar.f49249J;
                ql1.k makeImageFailedEvent = new ql1.k(gestaltAvatar, i14);
                im1.l doOnImageFailed = im1.l.f72658k;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(doOnImageFailed, "doOnImageFailed");
                Intrinsics.checkNotNullParameter(makeImageFailedEvent, "makeImageFailedEvent");
                Unit unit = Unit.f80348a;
                doOnImageFailed.invoke(unit);
                qVar.s((gm1.c) makeImageFailedEvent.invoke(unit));
                return;
        }
    }

    @Override // hs1.c
    public final void e() {
        switch (this.f108593a) {
            case 1:
                GestaltAvatar gestaltAvatar = (GestaltAvatar) this.f108594b;
                com.google.firebase.messaging.q qVar = gestaltAvatar.f49249J;
                p makeImageSetEvent = new p(gestaltAvatar, 7);
                im1.m doOnImageSet = im1.m.f72665k;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(doOnImageSet, "doOnImageSet");
                Intrinsics.checkNotNullParameter(makeImageSetEvent, "makeImageSetEvent");
                Unit unit = Unit.f80348a;
                doOnImageSet.invoke(unit);
                qVar.s((gm1.c) makeImageSetEvent.invoke(unit));
                break;
        }
    }

    @Override // hs1.c
    public final void f() {
        switch (this.f108593a) {
            case 1:
                GestaltAvatar gestaltAvatar = (GestaltAvatar) this.f108594b;
                com.google.firebase.messaging.q qVar = gestaltAvatar.f49249J;
                p makeImageSubmitEvent = new p(gestaltAvatar, 8);
                im1.m doOnImageSubmit = im1.m.f72666l;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(doOnImageSubmit, "doOnImageSubmit");
                Intrinsics.checkNotNullParameter(makeImageSubmitEvent, "makeImageSubmitEvent");
                Unit unit = Unit.f80348a;
                doOnImageSubmit.invoke(unit);
                qVar.s((gm1.c) makeImageSubmitEvent.invoke(unit));
                break;
        }
    }
}
