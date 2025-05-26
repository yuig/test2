package q5;

import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class y1 {

    /* renamed from: b, reason: collision with root package name */
    public static final a2 f102542b;

    /* renamed from: a, reason: collision with root package name */
    public final a2 f102543a;

    static {
        int i13 = Build.VERSION.SDK_INT;
        f102542b = (i13 >= 30 ? new r1() : i13 >= 29 ? new q1() : new p1()).b().f102400a.a().f102400a.b().f102400a.c();
    }

    public y1(@NonNull a2 a2Var) {
        this.f102543a = a2Var;
    }

    @NonNull
    public a2 a() {
        return this.f102543a;
    }

    @NonNull
    public a2 b() {
        return this.f102543a;
    }

    @NonNull
    public a2 c() {
        return this.f102543a;
    }

    public void d(@NonNull View view) {
    }

    public i e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return n() == y1Var.n() && m() == y1Var.m() && Objects.equals(j(), y1Var.j()) && Objects.equals(h(), y1Var.h()) && Objects.equals(e(), y1Var.e());
    }

    @NonNull
    public f5.e f(int i13) {
        return f5.e.f61080e;
    }

    @NonNull
    public f5.e g() {
        return j();
    }

    @NonNull
    public f5.e h() {
        return f5.e.f61080e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    @NonNull
    public f5.e i() {
        return j();
    }

    @NonNull
    public f5.e j() {
        return f5.e.f61080e;
    }

    @NonNull
    public f5.e k() {
        return j();
    }

    @NonNull
    public a2 l(int i13, int i14, int i15, int i16) {
        return f102542b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public boolean o(int i13) {
        return true;
    }

    public void p(f5.e[] eVarArr) {
    }

    public void q(a2 a2Var) {
    }

    public void r(f5.e eVar) {
    }
}
