package s;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.OverScroller;
import jk.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110263a = 2;

    /* renamed from: b, reason: collision with root package name */
    public int f110264b;

    /* renamed from: c, reason: collision with root package name */
    public int f110265c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f110266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f110267e;

    public h(w wVar, jk.d dVar, int i13, int i14) {
        this.f110267e = wVar;
        this.f110266d = dVar;
        this.f110264b = i13;
        this.f110265c = i14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o80.j jVar;
        ImageView h10;
        int i13 = this.f110263a;
        Object obj = this.f110267e;
        Object obj2 = this.f110266d;
        switch (i13) {
            case 0:
                ((j) obj).f110276b.onActivityResized(this.f110264b, this.f110265c, (Bundle) obj2);
                break;
            case 1:
                jk.d dVar = (jk.d) obj2;
                ((w) obj).c(new jk.d(dVar.f76320a, this.f110264b, this.f110265c, dVar.f76323d, dVar.f76324e, dVar.f76325f, dVar.f76326g, dVar.f76327h, dVar.f76328i));
                break;
            default:
                OverScroller overScroller = (OverScroller) obj2;
                if (!overScroller.isFinished() && (h10 = (jVar = (o80.j) obj).h()) != null && overScroller.computeScrollOffset()) {
                    int currX = overScroller.getCurrX();
                    int currY = overScroller.getCurrY();
                    jVar.f93510q.postTranslate(this.f110264b - currX, this.f110265c - currY);
                    jVar.l(jVar.g(), true);
                    this.f110264b = currX;
                    this.f110265c = currY;
                    h10.postOnAnimation(this);
                    break;
                }
                break;
        }
    }

    public h(j jVar, int i13, int i14, Bundle bundle) {
        this.f110267e = jVar;
        this.f110264b = i13;
        this.f110265c = i14;
        this.f110266d = bundle;
    }

    public h(Context context, o80.j jVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f110267e = jVar;
        this.f110266d = new OverScroller(context);
    }
}
