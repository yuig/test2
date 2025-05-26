package dp1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.design.brio.widget.voice.PinterestVoiceMessage;
import m60.d;
import oe0.h;
import oe0.l;
import ve0.e;
import ve0.q;

/* loaded from: classes2.dex */
public final class c implements ns1.a, h {

    /* renamed from: b, reason: collision with root package name */
    public String f56035b;

    /* renamed from: g, reason: collision with root package name */
    public final oe0.c f56040g;

    /* renamed from: a, reason: collision with root package name */
    public boolean f56034a = false;

    /* renamed from: c, reason: collision with root package name */
    public b f56036c = b.NONE;

    /* renamed from: d, reason: collision with root package name */
    public int f56037d = -1;

    /* renamed from: e, reason: collision with root package name */
    public String f56038e = "NO_TAG";

    /* renamed from: f, reason: collision with root package name */
    public boolean f56039f = false;

    public c(oe0.c cVar) {
        this.f56040g = cVar;
    }

    @Override // ns1.a
    public final boolean a(boolean z13) {
        if (!this.f56034a) {
            return false;
        }
        this.f56040g.a();
        return true;
    }

    @Override // oe0.h
    public final boolean b(String str, View view, String str2, boolean z13) {
        ((d) d.a()).g();
        oe0.c cVar = this.f56040g;
        if (!cVar.c()) {
            Context context = view.getContext();
            if (cVar.f94214b == null) {
                PinterestVoiceMessage pinterestVoiceMessage = new PinterestVoiceMessage(context);
                int i13 = eo1.b.color_themed_base_red_300;
                Object obj = d5.a.f53679a;
                pinterestVoiceMessage.c(context.getColor(i13));
                l lVar = new l(pinterestVoiceMessage);
                cVar.f94214b = lVar;
                lVar.g(cVar);
            }
            q qVar = cVar.f94214b.e().f44917h;
            qVar.f125691e = z13;
            e eVar = qVar.f125694h;
            if (eVar != null) {
                eVar.e(z13);
            }
            ViewGroup b13 = oe0.c.b(view);
            if (b13 != null) {
                cVar.f94214b.a(b13, str, view, oe0.e.ANCHOR_TO_START_AND_ALIGN);
                g(true);
                this.f56035b = str;
                this.f56036c = b.ERROR;
                this.f56037d = view.getId();
                this.f56038e = str2;
                this.f56039f = z13;
            }
        }
        bs1.c.s2(view, str);
        return this.f56034a;
    }

    @Override // oe0.h
    public final boolean c() {
        return a(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        if (r5 == false) goto L27;
     */
    @Override // ns1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(android.view.View r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = r4.f56038e
            boolean r0 = r6.equals(r0)
            r1 = 0
            if (r0 == 0) goto L69
            int r0 = r4.f56037d
            android.view.View r5 = r5.findViewById(r0)
            if (r5 == 0) goto L43
            dp1.b r0 = r4.f56036c
            dp1.b r2 = dp1.b.INLINE_ALERT
            java.lang.String r3 = ""
            if (r0 != r2) goto L23
            java.lang.String r0 = r4.f56035b
            if (r0 == 0) goto L1e
            r3 = r0
        L1e:
            boolean r5 = r4.h(r5, r3, r6)
            goto L40
        L23:
            dp1.b r2 = dp1.b.ERROR
            if (r0 != r2) goto L33
            java.lang.String r0 = r4.f56035b
            if (r0 == 0) goto L2c
            r3 = r0
        L2c:
            boolean r0 = r4.f56039f
            boolean r5 = r4.b(r3, r5, r6, r0)
            goto L40
        L33:
            dp1.b r2 = dp1.b.INLINE_EDUCATION
            if (r0 != r2) goto L58
            java.lang.String r0 = r4.f56035b
            if (r0 == 0) goto L3c
            r3 = r0
        L3c:
            boolean r5 = r4.i(r5, r3, r6)
        L40:
            if (r5 != 0) goto L68
            goto L58
        L43:
            m60.e r5 = m60.d.a()
            m60.d r5 = (m60.d) r5
            r5.g()
            java.util.HashSet r5 = tb0.h.f117076w
            tb0.h r5 = tb0.g.f117075a
            com.pinterest.hairball.kit.activity.config.VoiceConfigChangeHandler$AnchorViewNotFoundException r6 = new com.pinterest.hairball.kit.activity.config.VoiceConfigChangeHandler$AnchorViewNotFoundException
            r6.<init>()
            r5.p(r6)
        L58:
            r5 = -1
            r4.f56037d = r5
            r5 = 0
            r4.f56035b = r5
            dp1.b r5 = dp1.b.NONE
            r4.f56036c = r5
            java.lang.String r5 = "NO_TAG"
            r4.f56038e = r5
            r4.f56039f = r1
        L68:
            r1 = 1
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dp1.c.d(android.view.View, java.lang.String):boolean");
    }

    @Override // ns1.a
    public final boolean e(Bundle bundle) {
        if (!this.f56034a || bundle == null || this.f56037d == -1) {
            return false;
        }
        bundle.putString("brio.widget.voice.message.key", this.f56035b);
        bundle.putSerializable("brio.widget.voice.message.type.key", this.f56036c);
        bundle.putInt("brio.widget.voice.view.id.key", this.f56037d);
        bundle.putString("brio.widget.voice.invoker.id.key", this.f56038e);
        return true;
    }

    @Override // ns1.a
    public final boolean f(Bundle bundle) {
        int i13 = bundle.getInt("brio.widget.voice.view.id.key", -1);
        this.f56037d = i13;
        if (i13 == -1) {
            return false;
        }
        this.f56038e = bundle.getString("brio.widget.voice.invoker.id.key", "NO_TAG");
        this.f56035b = bundle.getString("brio.widget.voice.message.key", "");
        if (bundle.get("brio.widget.voice.message.type.key") != null) {
            this.f56036c = (b) bundle.get("brio.widget.voice.message.type.key");
        } else {
            this.f56036c = b.INLINE_ALERT;
        }
        return true;
    }

    public final void g(boolean z13) {
        if (this.f56034a != z13) {
            this.f56034a = z13;
            this.f56040g.f94215c = z13 ? this : null;
        }
    }

    public final boolean h(View view, String str, String str2) {
        ViewGroup b13;
        ((d) d.a()).g();
        oe0.c cVar = this.f56040g;
        if (!cVar.c()) {
            if (cVar.f94213a == null) {
                l lVar = new l(new PinterestVoiceMessage(view.getContext()));
                cVar.f94213a = lVar;
                lVar.f94252k = cVar;
            }
            if (view.isAttachedToWindow() && (b13 = oe0.c.b(view)) != null) {
                cVar.f94214b.a(b13, str, view, oe0.e.ANCHOR_TO_START_AND_ALIGN);
                g(true);
                this.f56035b = str;
                this.f56036c = b.INLINE_ALERT;
                this.f56037d = view.getId();
                this.f56038e = str2;
            }
        }
        bs1.c.s2(view, str);
        return this.f56034a;
    }

    public final boolean i(View view, String str, String str2) {
        ViewGroup b13;
        ((d) d.a()).g();
        oe0.c cVar = this.f56040g;
        if (!cVar.c()) {
            if (cVar.f94213a == null) {
                Context context = view.getContext();
                PinterestVoiceMessage pinterestVoiceMessage = new PinterestVoiceMessage(context);
                int i13 = eo1.b.color_blue_500;
                Object obj = d5.a.f53679a;
                pinterestVoiceMessage.c(context.getColor(i13));
                l lVar = new l(pinterestVoiceMessage);
                cVar.f94213a = lVar;
                lVar.f94252k = cVar;
            }
            if (view.isAttachedToWindow() && (b13 = oe0.c.b(view)) != null) {
                cVar.f94213a.a(b13, str, view, oe0.e.ANCHOR_TO_CENTER);
                g(true);
                this.f56035b = str;
                this.f56036c = b.INLINE_EDUCATION;
                this.f56037d = view.getId();
                this.f56038e = str2;
            }
        }
        bs1.c.s2(view, str);
        return this.f56034a;
    }
}
