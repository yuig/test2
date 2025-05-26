package cg;

import java.io.Writer;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class i extends h {
    @Override // cg.h
    public final Writer p(Writer writer, Object obj, List list) {
        this.f27669c.getClass();
        if (obj != null) {
            if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    return writer;
                }
            } else if (obj instanceof String) {
                if (!obj.toString().equals("")) {
                    return writer;
                }
            } else if (obj instanceof List) {
                if (((List) obj).size() > 0) {
                    return writer;
                }
            } else if (obj instanceof Iterable) {
                if (((Iterable) obj).iterator().hasNext()) {
                    return writer;
                }
            } else if (obj instanceof Iterator) {
                if (((Iterator) obj).hasNext()) {
                    return writer;
                }
            } else if (!obj.getClass().isArray() || Array.getLength(obj) > 0) {
                return writer;
            }
        }
        return s(writer, obj, list);
    }

    @Override // cg.h
    public final Writer q(Writer writer, Object obj, List list) {
        return obj instanceof Callable ? r(writer, (Callable) obj, list) : p(writer, obj, list);
    }

    @Override // cg.h
    public final Writer s(Writer writer, Object obj, List list) {
        return m(writer, list);
    }
}
