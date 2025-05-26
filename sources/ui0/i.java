package ui0;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.media3.ui.LegacyPlayerControlView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.messaging.q;
import com.pinterest.video.core.view.PinterestVideoView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122271a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f122272b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f122273c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f122274d;

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, int i13) {
        this.f122271a = i13;
        this.f122272b = obj;
        this.f122273c = obj2;
        this.f122274d = obj3;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e13) {
        int i13 = this.f122271a;
        Object obj = this.f122274d;
        Object obj2 = this.f122273c;
        Object obj3 = this.f122272b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(e13, "e");
                k kVar = (k) obj3;
                ti0.a aVar = kVar.f122284m;
                if (aVar != null) {
                    e eVar = (e) ((ri0.a) aVar.f117695a.getView());
                    BottomSheetBehavior bottomSheetBehavior = eVar.W8().f27255n;
                    if (bottomSheetBehavior != null && bottomSheetBehavior.L == 4) {
                        eVar.W8().s("UserTab", true);
                        return super.onSingleTapUp(e13);
                    }
                }
                Rect rect = new Rect();
                ((FrameLayout) obj2).getHitRect(rect);
                PinterestVideoView pinterestVideoView = (PinterestVideoView) obj;
                LegacyPlayerControlView legacyPlayerControlView = pinterestVideoView.f18945j;
                if (legacyPlayerControlView != null && legacyPlayerControlView.e() && rect.contains((int) e13.getX(), (int) e13.getY())) {
                    PinterestVideoView pinterestVideoView2 = kVar.f122278g;
                    pinterestVideoView2.P(true ^ pinterestVideoView2.getB());
                } else {
                    LegacyPlayerControlView legacyPlayerControlView2 = pinterestVideoView.f18945j;
                    if (legacyPlayerControlView2 == null || !legacyPlayerControlView2.e()) {
                        pinterestVideoView.C(pinterestVideoView.B());
                    } else {
                        pinterestVideoView.r();
                    }
                }
                return super.onSingleTapUp(e13);
            default:
                Intrinsics.checkNotNullParameter(e13, "e");
                Unit unit = Unit.f80348a;
                ((Function1) obj3).invoke(unit);
                ((q) obj2).s((gm1.c) ((Function1) obj).invoke(unit));
                return true;
        }
    }
}
