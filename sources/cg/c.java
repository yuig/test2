package cg;

import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

/* loaded from: classes3.dex */
public final class c extends b {

    /* renamed from: j, reason: collision with root package name */
    public bg.a[] f27676j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f27677k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f27678l;

    @Override // cg.b, bg.a
    public final synchronized void a() {
        if (!this.f27677k) {
            this.f27677k = true;
            super.a();
        }
    }

    @Override // cg.b, bg.a
    public final Writer b(Writer writer, List list) {
        if (!(list instanceof gg.b)) {
            list = new gg.b(list);
        }
        return super.b(writer, list);
    }

    @Override // cg.b, bg.a
    public final void c(bg.a[] aVarArr) {
        this.f27676j = aVarArr;
    }

    @Override // cg.b, bg.a
    public final bg.a[] g() {
        return this.f27676j;
    }

    @Override // cg.b, bg.a
    public final void h(StringWriter stringWriter) {
        n(stringWriter);
    }

    @Override // cg.b
    public final Writer m(Writer writer, List list) {
        bg.a[] aVarArr = this.f27676j;
        if (aVarArr != null) {
            for (bg.a aVar : aVarArr) {
                writer = aVar.b(writer, list);
            }
        }
        return writer;
    }
}
