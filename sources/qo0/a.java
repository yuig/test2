package qo0;

import h32.w0;
import java.util.HashMap;
import kotlin.collections.z0;
import nx.f0;
import uk1.d;

/* loaded from: classes5.dex */
public abstract class a extends d {

    /* renamed from: g, reason: collision with root package name */
    public final String f104521g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f104522h;

    /* renamed from: i, reason: collision with root package name */
    public HashMap f104523i;

    public a(String str, String str2, f0 f0Var) {
        super(str, new e3.a(5), f0Var);
        this.f104522h = false;
        this.f104523i = new HashMap();
        this.f104521g = str2;
    }

    @Override // uk1.d, nx.i1
    public w0 e() {
        z0.d();
        return new w0(null, null, null, null, z0.d(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.FALSE, null, null, null, null, null, null, this.f104521g, null, null, null, null);
    }

    public a(String str, String str2, f0 f0Var, e3.a aVar) {
        super(str, aVar, f0Var);
        this.f104522h = false;
        this.f104523i = new HashMap();
        this.f104521g = str2;
    }
}
