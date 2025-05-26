package qp1;

import android.view.View;
import com.pinterest.handshake.ui.webview.HandshakeWebView;
import com.pinterest.targethandshake.ui.webview.TargetHandshakeWebView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104750a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u50.r f104751b;

    public /* synthetic */ b(l82.c cVar, int i13) {
        this.f104750a = i13;
        this.f104751b = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f104750a;
        u50.r eventIntake = this.f104751b;
        switch (i13) {
            case 0:
                List list = HandshakeWebView.f49726g;
                Intrinsics.checkNotNullParameter(eventIntake, "$eventIntake");
                eventIntake.a(r.f104825a);
                break;
            default:
                List list2 = TargetHandshakeWebView.f52187g;
                Intrinsics.checkNotNullParameter(eventIntake, "$eventIntake");
                eventIntake.a(d92.o.f54179a);
                break;
        }
    }
}
