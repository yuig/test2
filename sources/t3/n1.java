package t3;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Looper;
import android.view.Choreographer;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class n1 extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116098a;

    public /* synthetic */ n1(int i13) {
        this.f116098a = i13;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        int i13 = this.f116098a;
        switch (i13) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper == null) {
                    throw new IllegalStateException("no Looper on this thread".toString());
                }
                p1 p1Var = new p1(choreographer, bf.b.z(myLooper));
                return p1Var.plus(p1Var.f116138l);
            case 1:
                return new PathMeasure();
            case 2:
                switch (i13) {
                    case 2:
                        return new Path();
                    default:
                        return new Path();
                }
            case 3:
                switch (i13) {
                    case 2:
                        return new Path();
                    default:
                        return new Path();
                }
            case 4:
                return new float[4];
            case 5:
                return 0L;
            default:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EE, dd MMM yyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                return simpleDateFormat;
        }
    }
}
