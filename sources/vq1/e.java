package vq1;

import androidx.appcompat.app.n;
import androidx.appcompat.widget.x;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126441a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f126442b;

    public /* synthetic */ e(x xVar, int i13) {
        this.f126441a = i13;
        this.f126442b = xVar;
    }

    public final void a(String url) {
        int i13 = this.f126441a;
        x this$0 = this.f126442b;
        switch (i13) {
            case 0:
                x.a(this$0, url);
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(url, "url");
                ((lu1.c) ((lu1.b) this$0.f16712e)).m((n) this$0.f16709b, url);
                break;
        }
    }
}
