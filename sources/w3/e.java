package w3;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.contentcapture.ContentCaptureSession;
import java.util.ArrayList;
import ua.j1;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f127892a;

    /* renamed from: b, reason: collision with root package name */
    public final View f127893b;

    public e(ContentCaptureSession contentCaptureSession, View view) {
        this.f127892a = contentCaptureSession;
        this.f127893b = view;
    }

    public final void a(ArrayList arrayList) {
        int i13 = Build.VERSION.SDK_INT;
        Object obj = this.f127892a;
        if (i13 >= 34) {
            d.a(j1.b(obj), arrayList);
            return;
        }
        if (i13 >= 29) {
            ContentCaptureSession b13 = j1.b(obj);
            View view = this.f127893b;
            ViewStructure b14 = c.b(b13, view);
            b.a(b14).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            c.d(j1.b(obj), b14);
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                c.d(j1.b(obj), (ViewStructure) arrayList.get(i14));
            }
            ViewStructure b15 = c.b(j1.b(obj), view);
            b.a(b15).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            c.d(j1.b(obj), b15);
        }
    }

    public final void b(long[] jArr) {
        int i13 = Build.VERSION.SDK_INT;
        Object obj = this.f127892a;
        View view = this.f127893b;
        if (i13 >= 34) {
            c.f(j1.b(obj), new a(f.a(view)).a(), jArr);
            return;
        }
        if (i13 >= 29) {
            ViewStructure b13 = c.b(j1.b(obj), view);
            b.a(b13).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            c.d(j1.b(obj), b13);
            c.f(j1.b(obj), new a(f.a(view)).a(), jArr);
            ViewStructure b14 = c.b(j1.b(obj), view);
            b.a(b14).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            c.d(j1.b(obj), b14);
        }
    }
}
