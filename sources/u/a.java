package u;

import a.o3;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.b3;
import androidx.camera.core.impl.c;
import androidx.camera.core.impl.h1;
import androidx.camera.core.impl.i1;
import androidx.camera.core.impl.j1;
import androidx.camera.core.impl.q1;
import androidx.camera.core.impl.u0;
import androidx.camera.core.impl.v0;
import androidx.camera.core.impl.v1;
import androidx.camera.core.impl.w1;
import androidx.camera.core.impl.y2;
import androidx.camera.core.impl.z2;
import c0.c0;
import c0.i0;
import c0.w;
import c0.w0;
import c0.z;
import com.bumptech.glide.d;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h0.g;
import h0.k;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import p0.e;

/* loaded from: classes2.dex */
public final class a implements y2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119716a;

    /* renamed from: b, reason: collision with root package name */
    public final q1 f119717b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(int i13) {
        this(q1.c(), 5);
        this.f119716a = i13;
        if (i13 == 1) {
            this.f119717b = q1.c();
            return;
        }
        if (i13 == 2) {
            this(q1.c(), 2);
            return;
        }
        if (i13 == 3) {
            this(q1.c(), 3);
            return;
        }
        if (i13 == 4) {
            this(q1.c(), 4);
        } else if (i13 != 5) {
            this.f119717b = q1.c();
        }
    }

    public static a d(v0 v0Var) {
        a aVar = new a(1);
        v0Var.h(new o3(6, aVar, v0Var));
        return aVar;
    }

    public final i0 a() {
        Object obj;
        Object obj2;
        Object obj3;
        c cVar = h1.f16853e;
        q1 q1Var = this.f119717b;
        q1Var.getClass();
        Object obj4 = null;
        try {
            obj = q1Var.f(cVar);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            q1Var.s(i1.f16872an, num);
        } else {
            c0 c0Var = i0.f24252z;
            c cVar2 = h1.f16854f;
            q1Var.getClass();
            try {
                obj2 = q1Var.f(cVar2);
            } catch (IllegalArgumentException unused2) {
                obj2 = null;
            }
            if (Objects.equals(obj2, 1)) {
                q1Var.s(i1.f16872an, 4101);
                q1Var.s(i1.f16873bn, z.f24400c);
            } else {
                q1Var.s(i1.f16872an, Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER));
            }
        }
        h1 h1Var = new h1(v1.b(q1Var));
        j1.m(h1Var);
        i0 i0Var = new i0(h1Var);
        c cVar3 = j1.f16884gn;
        q1Var.getClass();
        try {
            obj3 = q1Var.f(cVar3);
        } catch (IllegalArgumentException unused3) {
            obj3 = null;
        }
        Size size = (Size) obj3;
        if (size != null) {
            i0Var.f24257s = new Rational(size.getWidth(), size.getHeight());
        }
        c cVar4 = g.f66401to;
        Object D0 = l3.c.D0();
        q1Var.getClass();
        try {
            D0 = q1Var.f(cVar4);
        } catch (IllegalArgumentException unused4) {
        }
        d.s((Executor) D0, "The IO executor can't be null");
        c cVar5 = h1.f16851c;
        if (q1Var.f16980a.containsKey(cVar5)) {
            Integer num2 = (Integer) q1Var.f(cVar5);
            if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                throw new IllegalArgumentException("The flash mode is not allowed to set: " + num2);
            }
            if (num2.intValue() == 3) {
                c cVar6 = h1.f16859k;
                q1Var.getClass();
                try {
                    obj4 = q1Var.f(cVar6);
                } catch (IllegalArgumentException unused5) {
                }
                if (obj4 == null) {
                    throw new IllegalArgumentException("The flash mode is not allowed to set to FLASH_MODE_SCREEN without setting ScreenFlash");
                }
            }
        }
        return i0Var;
    }

    public final gc.c b() {
        return new gc.c(v1.b(this.f119717b), 12);
    }

    public final b c() {
        return new b(v1.b(this.f119717b));
    }

    public final z2 e() {
        int i13 = this.f119716a;
        q1 q1Var = this.f119717b;
        switch (i13) {
            case 3:
                return new h1(v1.b(q1Var));
            case 4:
                return new w1(v1.b(q1Var));
            case 5:
                return new e(v1.b(q1Var));
            default:
                return new s0.a(v1.b(q1Var));
        }
    }

    public final void f(CaptureRequest.Key key, Object obj) {
        this.f119717b.s(b.R(key), obj);
    }

    public final void g(CaptureRequest.Key key, Object obj, u0 u0Var) {
        this.f119717b.q(b.R(key), u0Var, obj);
    }

    public a(q1 q1Var, int i13) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        this.f119716a = i13;
        Object obj6 = null;
        if (i13 == 3) {
            this.f119717b = q1Var;
            try {
                obj = q1Var.f(k.f66416vo);
            } catch (IllegalArgumentException unused) {
                obj = null;
            }
            Class cls = (Class) obj;
            if (cls != null && !cls.equals(i0.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            this.f119717b.s(z2.f17024vn, b3.IMAGE_CAPTURE);
            this.f119717b.s(k.f66416vo, i0.class);
            q1 q1Var2 = this.f119717b;
            c cVar = k.f66415uo;
            q1Var2.getClass();
            try {
                obj6 = q1Var2.f(cVar);
            } catch (IllegalArgumentException unused2) {
            }
            if (obj6 == null) {
                this.f119717b.s(k.f66415uo, i0.class.getCanonicalName() + "-" + UUID.randomUUID());
                return;
            }
            return;
        }
        if (i13 == 4) {
            this.f119717b = q1Var;
            try {
                obj2 = q1Var.f(k.f66416vo);
            } catch (IllegalArgumentException unused3) {
                obj2 = null;
            }
            Class cls2 = (Class) obj2;
            if (cls2 != null && !cls2.equals(w0.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
            }
            this.f119717b.s(z2.f17024vn, b3.PREVIEW);
            this.f119717b.s(k.f66416vo, w0.class);
            q1 q1Var3 = this.f119717b;
            c cVar2 = k.f66415uo;
            q1Var3.getClass();
            try {
                obj6 = q1Var3.f(cVar2);
            } catch (IllegalArgumentException unused4) {
            }
            if (obj6 == null) {
                this.f119717b.s(k.f66415uo, w0.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
            Object obj7 = -1;
            try {
                obj7 = q1Var.f(j1.f16883fn);
            } catch (IllegalArgumentException unused5) {
            }
            if (((Integer) obj7).intValue() == -1) {
                q1Var.s(j1.f16883fn, 2);
                return;
            }
            return;
        }
        if (i13 == 5) {
            this.f119717b = q1Var;
            try {
                obj3 = q1Var.f(k.f66416vo);
            } catch (IllegalArgumentException unused6) {
                obj3 = null;
            }
            Class cls3 = (Class) obj3;
            if (cls3 != null && !cls3.equals(p0.d.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls3);
            }
            this.f119717b.s(z2.f17024vn, b3.STREAM_SHARING);
            this.f119717b.s(k.f66416vo, p0.d.class);
            q1 q1Var4 = this.f119717b;
            c cVar3 = k.f66415uo;
            q1Var4.getClass();
            try {
                obj6 = q1Var4.f(cVar3);
            } catch (IllegalArgumentException unused7) {
            }
            if (obj6 == null) {
                this.f119717b.s(k.f66415uo, p0.d.class.getCanonicalName() + "-" + UUID.randomUUID());
                return;
            }
            return;
        }
        if (i13 != 6) {
            this.f119717b = q1Var;
            try {
                obj5 = q1Var.f(k.f66416vo);
            } catch (IllegalArgumentException unused8) {
                obj5 = null;
            }
            Class cls4 = (Class) obj5;
            if (cls4 == null || cls4.equals(w.class)) {
                this.f119717b.s(k.f66416vo, w.class);
                q1 q1Var5 = this.f119717b;
                c cVar4 = k.f66415uo;
                q1Var5.getClass();
                try {
                    obj6 = q1Var5.f(cVar4);
                } catch (IllegalArgumentException unused9) {
                }
                if (obj6 == null) {
                    this.f119717b.s(k.f66415uo, w.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls4);
        }
        this.f119717b = q1Var;
        if (q1Var.f16980a.containsKey(s0.a.f110289b)) {
            try {
                obj4 = q1Var.f(k.f66416vo);
            } catch (IllegalArgumentException unused10) {
                obj4 = null;
            }
            Class cls5 = (Class) obj4;
            if (cls5 != null && !cls5.equals(r0.v0.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls5);
            }
            this.f119717b.s(z2.f17024vn, b3.VIDEO_CAPTURE);
            this.f119717b.s(k.f66416vo, r0.v0.class);
            q1 q1Var6 = this.f119717b;
            c cVar5 = k.f66415uo;
            q1Var6.getClass();
            try {
                obj6 = q1Var6.f(cVar5);
            } catch (IllegalArgumentException unused11) {
            }
            if (obj6 == null) {
                this.f119717b.s(k.f66415uo, r0.v0.class.getCanonicalName() + "-" + UUID.randomUUID());
                return;
            }
            return;
        }
        throw new IllegalArgumentException("VideoOutput is required");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(r0.c1 r4) {
        /*
            r3 = this;
            r0 = 6
            r3.f119716a = r0
            androidx.camera.core.impl.q1 r1 = androidx.camera.core.impl.q1.c()
            androidx.camera.core.impl.c r2 = s0.a.f110289b
            r1.s(r2, r4)
            r3.<init>(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u.a.<init>(r0.c1):void");
    }
}
