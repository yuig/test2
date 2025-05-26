package yj2;

import java.io.PrintStream;
import java.io.PrintWriter;
import kh2.w;

/* loaded from: classes4.dex */
public final class a extends w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139220a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f139221b;

    public /* synthetic */ a(Object obj, int i13) {
        this.f139220a = i13;
        this.f139221b = obj;
    }

    public final void E0(String str) {
        int i13 = this.f139220a;
        Object obj = this.f139221b;
        switch (i13) {
            case 0:
                ((PrintStream) obj).println((Object) str);
                break;
            default:
                ((PrintWriter) obj).println((Object) str);
                break;
        }
    }
}
