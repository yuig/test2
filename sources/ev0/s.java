package ev0;

import android.content.Context;
import android.util.Patterns;
import android.view.View;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.feature.ideaPinCreation.metadata.view.MetadataEditText;
import com.pinterest.gestalt.text.GestaltText;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import uq.w;
import xk2.v;

/* loaded from: classes5.dex */
public final class s extends w implements yk1.n, n {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f60273l = 0;

    /* renamed from: d, reason: collision with root package name */
    public final uk2.f f60274d;

    /* renamed from: e, reason: collision with root package name */
    public final v f60275e;

    /* renamed from: f, reason: collision with root package name */
    public final v f60276f;

    /* renamed from: g, reason: collision with root package name */
    public final v f60277g;

    /* renamed from: h, reason: collision with root package name */
    public final v f60278h;

    /* renamed from: i, reason: collision with root package name */
    public Function2 f60279i;

    /* renamed from: j, reason: collision with root package name */
    public final dv0.q f60280j;

    /* renamed from: k, reason: collision with root package name */
    public final xj2.b f60281k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, uk2.f keyboardPublishSubject, h22.f storyPinService, du0.b presenterPinalytics) {
        super(context, null, 0, 12, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(keyboardPublishSubject, "keyboardPublishSubject");
        Intrinsics.checkNotNullParameter(storyPinService, "storyPinService");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        this.f60274d = keyboardPublishSubject;
        this.f60275e = xk2.m.b(new q(this, 0));
        this.f60276f = xk2.m.b(new q(this, 2));
        this.f60277g = xk2.m.b(new q(this, 1));
        this.f60278h = xk2.m.b(new q(this, 3));
        this.f60279i = r.f60272i;
        this.f60281k = new xj2.b();
        this.f60280j = new dv0.q(this, storyPinService, presenterPinalytics);
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        View.inflate(context, aq1.f.idea_pin_metadata_link_creation_view, this);
        MetadataEditText L = L();
        L.setImeOptions(6);
        L.setRawInputType(17);
        Intrinsics.checkNotNullParameter(this, "listener");
        L.f46544g = this;
        L().setOnEditorActionListener(new p(this));
        L().setOnFocusChangeListener(new com.google.android.material.datepicker.h(this, 4));
        T().j(new np0.h(this, 11));
        MetadataEditText L2 = L();
        Intrinsics.f(L2);
        L2.setPadding(0, 0, 0, 0);
        L2.setHintTextColor(bs1.c.B(L2, eo1.b.color_gray_500));
    }

    public final MetadataEditText L() {
        return (MetadataEditText) this.f60275e.getValue();
    }

    public final GestaltText T() {
        return (GestaltText) this.f60276f.getValue();
    }

    public final void X(String link, String str, boolean z13) {
        Intrinsics.checkNotNullParameter(link, "link");
        this.f60279i.invoke(Boolean.valueOf(z13), link);
        ((ProgressBar) this.f60278h.getValue()).setVisibility(8);
        v vVar = this.f60277g;
        if (z13) {
            GestaltText gestaltText = (GestaltText) vVar.getValue();
            Intrinsics.checkNotNullExpressionValue(gestaltText, "<get-linkErrorMessage>(...)");
            a0.k0(gestaltText);
            return;
        }
        GestaltText gestaltText2 = (GestaltText) vVar.getValue();
        Intrinsics.checkNotNullExpressionValue(gestaltText2, "<get-linkErrorMessage>(...)");
        a0.w1(gestaltText2);
        if (str == null || str.length() == 0) {
            GestaltText gestaltText3 = (GestaltText) vVar.getValue();
            Intrinsics.checkNotNullExpressionValue(gestaltText3, "<get-linkErrorMessage>(...)");
            a0.o(gestaltText3, aq1.h.link_validation_error_message, new Object[0]);
        } else {
            GestaltText gestaltText4 = (GestaltText) vVar.getValue();
            Intrinsics.checkNotNullExpressionValue(gestaltText4, "<get-linkErrorMessage>(...)");
            a0.p(gestaltText4, str);
        }
    }

    public final void Z() {
        String link = String.valueOf(L().getText());
        int i13 = 0;
        if (link.length() == 0) {
            L().setVisibility(0);
            GestaltText T = T();
            Intrinsics.checkNotNullExpressionValue(T, "<get-linkPreview>(...)");
            a0.k0(T);
            L().setText(link);
        } else {
            L().setVisibility(8);
            GestaltText T2 = T();
            Intrinsics.checkNotNullExpressionValue(T2, "<get-linkPreview>(...)");
            a0.w1(T2);
            GestaltText T3 = T();
            Intrinsics.checkNotNullExpressionValue(T3, "<get-linkPreview>(...)");
            a0.p(T3, link);
        }
        dv0.q qVar = this.f60280j;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(link, "link");
        s sVar = (s) qVar.f56381b;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(link, "link");
        Function2 function2 = sVar.f60279i;
        Boolean bool = Boolean.FALSE;
        function2.invoke(bool, link);
        ((ProgressBar) sVar.f60278h.getValue()).setVisibility(0);
        if (((HashMap) qVar.f56384e).containsKey(link)) {
            Pair pair = (Pair) ((HashMap) qVar.f56384e).get(link);
            if (pair != null) {
                ((s) qVar.f56381b).X(link, (String) pair.f80347b, ((Boolean) pair.f80346a).booleanValue());
                return;
            }
            return;
        }
        int i14 = 1;
        if (link.length() == 0) {
            ((s) qVar.f56381b).X(link, null, true);
            return;
        }
        if (!Patterns.WEB_URL.matcher(link).matches()) {
            ((HashMap) qVar.f56384e).put(link, new Pair(bool, null));
            ((s) qVar.f56381b).X(link, null, false);
            return;
        }
        s sVar2 = (s) qVar.f56381b;
        xj2.c disposable = ((h22.f) qVar.f56382c).j(link).r(tk2.e.f118017c).l(wj2.c.a()).o(new mu0.a(27, new dv0.p(qVar, link, i13)), new mu0.a(28, new dv0.p(qVar, link, i14)));
        Intrinsics.checkNotNullExpressionValue(disposable, "subscribe(...)");
        sVar2.getClass();
        Intrinsics.checkNotNullParameter(disposable, "disposable");
        sVar2.f60281k.a(disposable);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        xj2.c disposable = this.f60274d.H(wj2.c.a()).F(new g(4, new au0.f(this, 14)), new g(5, j.f60262l), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(disposable, "subscribe(...)");
        Intrinsics.checkNotNullParameter(disposable, "disposable");
        this.f60281k.a(disposable);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f60281k.d();
    }
}
