package n8;

import a7.m1;
import a7.n1;
import a7.w0;
import a7.x0;
import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import d7.n0;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import l7.p0;
import pk.v2;

/* loaded from: classes3.dex */
public final class s implements n1 {

    /* renamed from: y, reason: collision with root package name */
    public static final u5.j f89871y = new u5.j(2);

    /* renamed from: a, reason: collision with root package name */
    public final Context f89872a;

    /* renamed from: b, reason: collision with root package name */
    public final d7.j0 f89873b = new d7.j0();

    /* renamed from: c, reason: collision with root package name */
    public final w0 f89874c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f89875d;

    /* renamed from: e, reason: collision with root package name */
    public final v2 f89876e;

    /* renamed from: f, reason: collision with root package name */
    public final v5.x f89877f;

    /* renamed from: g, reason: collision with root package name */
    public final c f89878g;

    /* renamed from: h, reason: collision with root package name */
    public final l f89879h;

    /* renamed from: i, reason: collision with root package name */
    public final d7.e f89880i;

    /* renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArraySet f89881j;

    /* renamed from: k, reason: collision with root package name */
    public androidx.media3.common.b f89882k;

    /* renamed from: l, reason: collision with root package name */
    public d7.i0 f89883l;

    /* renamed from: m, reason: collision with root package name */
    public p0 f89884m;

    /* renamed from: n, reason: collision with root package name */
    public long f89885n;

    /* renamed from: o, reason: collision with root package name */
    public Pair f89886o;

    /* renamed from: p, reason: collision with root package name */
    public int f89887p;

    /* renamed from: q, reason: collision with root package name */
    public int f89888q;

    /* renamed from: r, reason: collision with root package name */
    public m7.p0 f89889r;

    /* renamed from: s, reason: collision with root package name */
    public long f89890s;

    /* renamed from: t, reason: collision with root package name */
    public long f89891t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f89892u;

    /* renamed from: v, reason: collision with root package name */
    public long f89893v;

    /* renamed from: w, reason: collision with root package name */
    public int f89894w;

    /* renamed from: x, reason: collision with root package name */
    public int f89895x;

    public s(m mVar) {
        this.f89872a = mVar.f89847a;
        r rVar = mVar.f89850d;
        bf.b.w(rVar);
        this.f89874c = rVar;
        this.f89875d = new SparseArray();
        this.f89876e = mVar.f89851e;
        this.f89877f = mVar.f89852f;
        d7.e eVar = mVar.f89853g;
        this.f89880i = eVar;
        this.f89878g = new c(mVar.f89848b, eVar);
        this.f89879h = new l(this);
        this.f89881j = new CopyOnWriteArraySet();
        this.f89882k = new androidx.media3.common.b(new a7.q());
        this.f89890s = -9223372036854775807L;
        this.f89891t = -9223372036854775807L;
        this.f89894w = -1;
        this.f89888q = 0;
    }

    public final o a() {
        SparseArray sparseArray = this.f89875d;
        bf.b.t(!n0.k(sparseArray, 0));
        o oVar = new o(this, this.f89872a);
        this.f89881j.add(oVar);
        sparseArray.put(0, oVar);
        return oVar;
    }

    public final void b(Surface surface, int i13, int i14) {
        p0 p0Var = this.f89884m;
        if (p0Var == null) {
            return;
        }
        c cVar = this.f89878g;
        if (surface != null) {
            x0 x0Var = new x0(surface, i13, i14);
            p0Var.f81864i = x0Var;
            m1 m1Var = p0Var.f81863h;
            if (m1Var != null) {
                ((l7.w) m1Var).b(x0Var);
            }
            cVar.g(surface, new d7.f0(i13, i14));
            return;
        }
        p0Var.f81864i = null;
        m1 m1Var2 = p0Var.f81863h;
        if (m1Var2 != null) {
            ((l7.w) m1Var2).b(null);
        }
        cVar.f89752e = null;
        cVar.f89748a.h(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [n8.k] */
    public final m1 c(int i13, androidx.media3.common.b bVar) {
        boolean z13 = false;
        z13 = false;
        c cVar = this.f89878g;
        final int i14 = 1;
        if (i13 == 0) {
            bf.b.t(this.f89888q == 0);
            a7.j jVar = bVar.C;
            if (jVar == null || !jVar.e()) {
                jVar = a7.j.f1080h;
            }
            if (jVar.f1084c == 7 && n0.f53866a < 34) {
                k5.a a13 = jVar.a();
                a13.f78309c = 6;
                jVar = a13.a();
            }
            a7.j jVar2 = jVar;
            Looper myLooper = Looper.myLooper();
            bf.b.w(myLooper);
            final d7.i0 a14 = ((d7.g0) this.f89880i).a(myLooper, null);
            this.f89883l = a14;
            try {
                w0 w0Var = this.f89874c;
                Context context = this.f89872a;
                final int i15 = z13 ? 1 : 0;
                p0 a15 = w0Var.a(context, jVar2, this, new Executor() { // from class: n8.k
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        int i16 = i15;
                        ((d7.i0) a14).d(runnable);
                    }
                }, this.f89877f, this.f89876e);
                this.f89884m = a15;
                a15.getClass();
                Pair pair = this.f89886o;
                if (pair != null) {
                    Surface surface = (Surface) pair.first;
                    d7.f0 f0Var = (d7.f0) pair.second;
                    b(surface, f0Var.f53821a, f0Var.f53822b);
                }
                cVar.getClass();
                this.f89888q = 1;
            } catch (VideoFrameProcessingException e13) {
                throw new VideoSink$VideoSinkException(e13, bVar);
            }
        } else if (this.f89888q != 1) {
            return null;
        }
        try {
            p0 p0Var = this.f89884m;
            p0Var.getClass();
            p0Var.a(i13);
            this.f89895x++;
            androidx.appcompat.widget.q qVar = new androidx.appcompat.widget.q(this);
            final d7.i0 i0Var = this.f89883l;
            i0Var.getClass();
            Executor executor = new Executor() { // from class: n8.k
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    int i16 = i14;
                    ((d7.i0) i0Var).d(runnable);
                }
            };
            cVar.f89756i = qVar;
            cVar.f89757j = executor;
            p0 p0Var2 = this.f89884m;
            int i16 = p0Var2.f81866k;
            if (i16 != -1 && i16 == i13) {
                z13 = true;
            }
            bf.b.i(z13);
            m1 m1Var = p0Var2.f81863h;
            bf.b.w(m1Var);
            return m1Var;
        } catch (VideoFrameProcessingException e14) {
            throw new VideoSink$VideoSinkException(e14, bVar);
        }
    }
}
