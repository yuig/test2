package ec2;

import ac2.a1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.video.core.view.PinCloseupVideoEndFrameLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import xk2.v;

/* loaded from: classes4.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f58436i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f58437j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ PinCloseupVideoEndFrameLayout f58438k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Context context, PinCloseupVideoEndFrameLayout pinCloseupVideoEndFrameLayout, int i13) {
        super(0);
        this.f58436i = i13;
        this.f58437j = context;
        this.f58438k = pinCloseupVideoEndFrameLayout;
    }

    public final LinearLayout b() {
        int i13 = this.f58436i;
        PinCloseupVideoEndFrameLayout pinCloseupVideoEndFrameLayout = this.f58438k;
        Context context = this.f58437j;
        switch (i13) {
            case 0:
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setId(a1.closeup_video_replay_button);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(16);
                linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                linearLayout.addView((GestaltIconButton) pinCloseupVideoEndFrameLayout.f52742a.getValue());
                v vVar = pinCloseupVideoEndFrameLayout.f52744c;
                linearLayout.addView((GestaltText) vVar.getValue());
                linearLayout.setFocusable(true);
                linearLayout.setContentDescription(((GestaltText) vVar.getValue()).getText());
                return linearLayout;
            case 1:
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                linearLayout2.setGravity(8388611);
                linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
                linearLayout2.addView((LinearLayout) pinCloseupVideoEndFrameLayout.f52747f.getValue());
                linearLayout2.addView((View) pinCloseupVideoEndFrameLayout.f52748g.getValue());
                linearLayout2.addView((LinearLayout) pinCloseupVideoEndFrameLayout.f52745d.getValue());
                return linearLayout2;
            default:
                LinearLayout linearLayout3 = new LinearLayout(context);
                linearLayout3.setId(a1.closeup_video_send_after_play);
                linearLayout3.setOrientation(0);
                linearLayout3.setGravity(16);
                linearLayout3.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 17));
                linearLayout3.addView((GestaltIconButton) pinCloseupVideoEndFrameLayout.f52743b.getValue());
                v vVar2 = pinCloseupVideoEndFrameLayout.f52746e;
                linearLayout3.addView((GestaltText) vVar2.getValue());
                linearLayout3.setFocusable(true);
                linearLayout3.setContentDescription(((GestaltText) vVar2.getValue()).getText());
                return linearLayout3;
        }
    }

    public final GestaltText e() {
        Context context = this.f58437j;
        int i13 = this.f58436i;
        PinCloseupVideoEndFrameLayout pinCloseupVideoEndFrameLayout = this.f58438k;
        int i14 = 0;
        switch (i13) {
            case 2:
                GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
                gestaltText.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
                gestaltText.setPaddingRelative(gestaltText.getResources().getDimensionPixelSize(eo1.c.margin), 0, 0, 0);
                return gestaltText.i(new d(pinCloseupVideoEndFrameLayout, i14));
            default:
                GestaltText gestaltText2 = new GestaltText(6, context, (AttributeSet) null);
                gestaltText2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
                gestaltText2.setPaddingRelative(gestaltText2.getResources().getDimensionPixelSize(eo1.c.margin), 0, 0, 0);
                return gestaltText2.i(new d(pinCloseupVideoEndFrameLayout, 1));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f58436i) {
            case 0:
                return b();
            case 1:
                return b();
            case 2:
                return e();
            case 3:
                return b();
            default:
                return e();
        }
    }
}
