package nm;

import java.io.IOException;
import java.io.StringWriter;
import qm.n1;
import qm.z0;

/* loaded from: classes.dex */
public abstract class s {
    public boolean b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public float d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final q f() {
        if (this instanceof q) {
            return (q) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public final u i() {
        if (this instanceof u) {
            return (u) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public final v j() {
        if (this instanceof v) {
            return (v) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public long l() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public Number n() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String p() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            um.c cVar = new um.c(stringWriter);
            cVar.w(b0.LENIENT);
            z0 z0Var = n1.B;
            z0Var.getClass();
            z0Var.e(this, cVar);
            return stringWriter.toString();
        } catch (IOException e13) {
            throw new AssertionError(e13);
        }
    }
}
