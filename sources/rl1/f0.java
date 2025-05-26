package rl1;

import android.graphics.Canvas;
import com.pinterest.gestalt.avatar.LegacyGestaltAvatar;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f108572i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ LegacyGestaltAvatar f108573j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(LegacyGestaltAvatar legacyGestaltAvatar, int i13) {
        super(1);
        this.f108572i = i13;
        this.f108573j = legacyGestaltAvatar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LegacyGestaltAvatar legacyGestaltAvatar = this.f108573j;
        int i13 = this.f108572i;
        switch (i13) {
            case 0:
                Canvas canvas = (Canvas) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(canvas, "canvas");
                        super/*android.view.View*/.dispatchDraw(canvas);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(canvas, "canvas");
                        super/*com.pinterest.ui.imageview.GenericWebImageView*/.onDraw(canvas);
                        break;
                }
                break;
            case 1:
                Canvas canvas2 = (Canvas) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(canvas2, "canvas");
                        super/*android.view.View*/.dispatchDraw(canvas2);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(canvas2, "canvas");
                        super/*com.pinterest.ui.imageview.GenericWebImageView*/.onDraw(canvas2);
                        break;
                }
                break;
            default:
                int i14 = LegacyGestaltAvatar.K;
                legacyGestaltAvatar.f52564p = (hs1.c) obj;
                break;
        }
        return Unit.f80348a;
    }
}
