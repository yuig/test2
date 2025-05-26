package zp;

import a.cb;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ nx.d0 f142389i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f142390j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ou1.e f142391k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f142392l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f142393m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f142394n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ f f142395o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(nx.d0 d0Var, Context context, ou1.e eVar, String str, String str2, int i13, f fVar) {
        super(0);
        this.f142389i = d0Var;
        this.f142390j = context;
        this.f142391k = eVar;
        this.f142392l = str;
        this.f142393m = str2;
        this.f142394n = i13;
        this.f142395o = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String sessionId = cb.g("toString(...)");
        nx.d0 pinalytics = this.f142389i;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Context context = this.f142390j;
        Intrinsics.checkNotNullParameter(context, "context");
        ou1.e entryType = this.f142391k;
        Intrinsics.checkNotNullParameter(entryType, "entryType");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        f fVar = this.f142395o;
        Object obj = fVar.f142401d.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        ((zf1.e) obj).b(false);
        boolean z13 = entryType == ou1.e.UPLOAD_ERROR_DIALOG;
        wf1.b.Companion.getClass();
        boolean z14 = z13 || (wf1.a.a() == wf1.b.UNAVAILABLE);
        HashMap o13 = ep.b.o("idea_pin_creation_session_id", sessionId);
        o13.put("is_draft", String.valueOf(z14));
        o13.put("entry_type", entryType.getValue());
        pinalytics.g(h32.f1.STORY_PIN_CREATION_BEGIN, null, o13, false);
        int i13 = this.f142394n;
        lu1.d dVar = fVar.f142402e;
        if (z14) {
            Intent b13 = dVar.b(context, lu1.a.CREATION_ACTIVITY);
            b13.putExtra("com.pinterest.EXTRA_IDEA_PIN_CREATION_SESSION_ID", sessionId);
            b13.putExtra("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE", entryType.getValue());
            b13.putExtra("com.pinterest.EXTRA_IS_STORY_PIN_DRAFT", true);
            b13.putExtra("com.pinterest.EXTRA_PIN_CREATE_TYPE", "story_pin_from_draft");
            b13.putExtra("com.pinterest.EXTRA_PIN_SCHEDULED_TIME_SECONDS", i13);
            context.startActivity(b13);
        } else {
            new oy.t(3, 0).i();
            pinalytics.F(h32.g0.MODAL_DIALOG, h32.u0.CREATE_STORY_PIN_BUTTON);
            if (bs1.c.c1(context)) {
                Activity k03 = bs1.c.k0(context);
                ((ag1.b) fVar.f142403f.get()).a();
                Intent b14 = dVar.b(k03, lu1.a.CREATION_ACTIVITY);
                b14.putExtra("com.pinterest.EXTRA_IDEA_PIN_CREATION_SESSION_ID", sessionId);
                b14.putExtra("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE", entryType.getValue());
                b14.putExtra("com.pinterest.EXTRA_IS_STORY_PIN_DRAFT", false);
                b14.putExtra("com.pinterest.EXTRA_PIN_CREATE_TYPE", "story_pin");
                String str = this.f142392l;
                if (str == null) {
                    str = "";
                }
                b14.putExtra("com.pinterest.EXTRA_BOARD_ID", str);
                String str2 = this.f142393m;
                b14.putExtra("com.pinterest.EXTRA_BOARD_SECTION_ID", str2 != null ? str2 : "");
                b14.putExtra("com.pinterest.EXTRA_PIN_SCHEDULED_TIME_SECONDS", i13);
                k03.startActivity(b14);
            }
        }
        return Unit.f80348a;
    }
}
