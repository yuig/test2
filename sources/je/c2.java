package je;

import com.caverock.androidsvg.SVGParseException;

/* loaded from: classes3.dex */
public abstract class c2 extends m1 {
    @Override // je.m1, je.n1
    public final void g(r1 r1Var) {
        if (r1Var instanceof b2) {
            this.f75696i.add(r1Var);
            return;
        }
        throw new SVGParseException("Text content elements cannot contain " + r1Var + " elements.");
    }
}
