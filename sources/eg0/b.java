package eg0;

import i32.u;
import net.quikkly.android.ui.CameraPreview;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f58874a;

    /* renamed from: b, reason: collision with root package name */
    public final int f58875b;

    /* renamed from: c, reason: collision with root package name */
    public final String f58876c;

    /* renamed from: d, reason: collision with root package name */
    public final int f58877d;

    /* renamed from: e, reason: collision with root package name */
    public final c f58878e;

    /* renamed from: f, reason: collision with root package name */
    public final a f58879f;

    /* renamed from: g, reason: collision with root package name */
    public final long f58880g;

    /* renamed from: h, reason: collision with root package name */
    public final String f58881h;

    public b(vd0.c cVar) {
        cVar.j(0, "id");
        this.f58874a = cVar.n(cVar.n(CameraPreview.AUTOFOCUS_INTERVAL_MILLIS, "display_delay"), "delay_in_millis");
        cVar.j(0, "complete_action");
        u uVar = u.DONT_COMPLETE_AND_HIDE;
        this.f58875b = cVar.j(uVar.value(), "click_action");
        cVar.j(uVar.value(), "backpress_action");
        this.f58876c = cVar.d("title_text");
        this.f58877d = cVar.j(0, "prompt_image");
        cVar.d("detail_text");
        this.f58878e = cVar.m("tooltip") != null ? new c(cVar.m("tooltip")) : null;
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = cVar.h("is_blocking", bool).booleanValue();
        cVar.n(1000L, "press_and_hold_time");
        cVar.n(500L, "exit_time");
        String o13 = cVar.o("bot_challenge_type", "press_and_hold");
        Boolean h10 = cVar.h("dismiss_on_background_tap", Boolean.TRUE);
        if (cVar.m("upsell") != null) {
            Boolean h13 = cVar.m("upsell").h("dismiss_on_background_tap", h10);
            vd0.c m13 = cVar.m("upsell");
            int j13 = cVar.j(0, "action_prompt_type");
            cVar.d("aux_data");
            this.f58879f = new a(m13, j13, booleanValue, o13, h13.booleanValue());
        } else {
            this.f58879f = null;
        }
        cVar.h("grid_pulsar", bool).getClass();
        this.f58880g = cVar.j(-1, "dismiss_timer_in_millis");
        this.f58881h = cVar.o("text_background", "");
    }
}
