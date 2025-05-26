package cg;

import bg.m;
import com.github.mustachejava.MustacheException;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;
import r0.p0;

/* loaded from: classes3.dex */
public class h extends b {

    /* renamed from: j, reason: collision with root package name */
    public final ExecutorService f27681j;

    public h(bg.l lVar, bg.d dVar, c cVar, String str, String str2) {
        super(lVar, dVar, cVar, str, str2);
        this.f27681j = (ExecutorService) dVar.f22763g;
    }

    @Override // cg.b, bg.a
    public final Writer b(Writer writer, List list) {
        Writer q13 = q(writer, l(list), list);
        i(q13);
        return q13;
    }

    public Writer p(Writer writer, Object obj, List list) {
        this.f27669c.getClass();
        if (obj == null) {
            return writer;
        }
        if ((obj instanceof Boolean) && !((Boolean) obj).booleanValue()) {
            return writer;
        }
        if ((obj instanceof String) && obj.toString().equals("")) {
            return writer;
        }
        int i13 = 0;
        if (obj instanceof List) {
            List list2 = (List) obj;
            int size = list2.size();
            while (i13 < size) {
                writer = s(writer, ve.h.c(list2.get(i13)), list);
                i13++;
            }
            return writer;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                writer = s(writer, ve.h.c(it.next()), list);
            }
            return writer;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                writer = s(writer, ve.h.c(it2.next()), list);
            }
            return writer;
        }
        if (!obj.getClass().isArray()) {
            return s(writer, obj, list);
        }
        int length = Array.getLength(obj);
        while (i13 < length) {
            writer = s(writer, ve.h.c(Array.get(obj, i13)), list);
            i13++;
        }
        return writer;
    }

    public Writer q(Writer writer, Object obj, List list) {
        if (obj == null) {
            return writer;
        }
        if (!(obj instanceof Function)) {
            return obj instanceof Callable ? r(writer, (Callable) obj, list) : p(writer, obj, list);
        }
        Function function = (Function) obj;
        StringWriter stringWriter = new StringWriter();
        n(stringWriter);
        boolean z13 = function instanceof m;
        int i13 = 0;
        bg.d dVar = this.f27675i;
        bg.l lVar = this.f27671e;
        if (z13) {
            try {
                Object apply = function.apply(stringWriter.toString());
                if (apply == null) {
                    return writer;
                }
                c cVar = (c) ((ConcurrentHashMap) dVar.f22759c).computeIfAbsent(new bg.h(lVar, apply.toString()), new bg.c(dVar, i13));
                cVar.a();
                return cVar.b(writer, list);
            } catch (Exception e13) {
                throw new MustacheException("Function failure", e13, lVar);
            }
        }
        try {
            StringWriter stringWriter2 = new StringWriter();
            c cVar2 = (c) ((ConcurrentHashMap) dVar.f22759c).computeIfAbsent(new bg.h(lVar, stringWriter.toString()), new bg.c(dVar, i13));
            cVar2.a();
            cVar2.b(stringWriter2, list).close();
            try {
                Object apply2 = function.apply(stringWriter2.toString());
                if (apply2 == null) {
                    return writer;
                }
                writer.write(apply2.toString());
                return writer;
            } catch (Exception e14) {
                throw new MustacheException("Function failure", e14, lVar);
            }
        } catch (IOException e15) {
            throw new MustacheException("Failed to write function result", e15, lVar);
        }
    }

    public final Writer r(Writer writer, Callable callable, List list) {
        bg.l lVar = this.f27671e;
        ExecutorService executorService = this.f27681j;
        if (executorService == null) {
            try {
                return p(writer, callable.call(), list);
            } catch (Exception e13) {
                throw new MustacheException(e13, lVar);
            }
        }
        try {
            writer.flush();
            gg.c cVar = new gg.c(writer);
            executorService.execute(new p0(this, callable, writer, new gg.b(list), cVar, 2));
            return cVar;
        } catch (IOException e14) {
            throw new MustacheException("Failed to flush writer", e14, lVar);
        }
    }

    public Writer s(Writer writer, Object obj, List list) {
        boolean z13;
        if (obj != null) {
            list.add(obj);
            z13 = true;
        } else {
            z13 = false;
        }
        Writer m13 = m(writer, list);
        if (z13) {
            list.remove(list.size() - 1);
        }
        return m13;
    }
}
