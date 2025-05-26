package je;

import android.graphics.Matrix;
import com.caverock.androidsvg.SVGParseException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class g0 extends p1 implements n1 {

    /* renamed from: h, reason: collision with root package name */
    public List f75610h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public Boolean f75611i;

    /* renamed from: j, reason: collision with root package name */
    public Matrix f75612j;

    /* renamed from: k, reason: collision with root package name */
    public h0 f75613k;

    /* renamed from: l, reason: collision with root package name */
    public String f75614l;

    @Override // je.n1
    public final void g(r1 r1Var) {
        if (r1Var instanceof z0) {
            this.f75610h.add(r1Var);
            return;
        }
        throw new SVGParseException("Gradient elements cannot contain " + r1Var + " elements.");
    }

    @Override // je.n1
    public final List getChildren() {
        return this.f75610h;
    }
}
