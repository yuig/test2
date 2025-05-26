package cg;

import com.github.mustachejava.MustacheException;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;

/* loaded from: classes3.dex */
public final class k extends b {

    /* renamed from: j, reason: collision with root package name */
    public final boolean f27687j;

    /* renamed from: k, reason: collision with root package name */
    public final ExecutorService f27688k;

    public k(bg.l lVar, bg.d dVar, String str, boolean z13) {
        super(lVar, dVar, null, str, "");
        this.f27687j = z13;
        this.f27688k = (ExecutorService) dVar.f22763g;
    }

    @Override // cg.b, bg.a
    public final Writer b(Writer writer, List list) {
        try {
            Object l13 = l(list);
            if (l13 != null) {
                if (l13 instanceof Function) {
                    r(writer, (Function) l13, list);
                } else {
                    if (l13 instanceof Callable) {
                        return q(writer, (Callable) l13, list);
                    }
                    this.f27669c.getClass();
                    p(writer, l13.toString());
                }
            }
            return super.b(writer, list);
        } catch (Exception e13) {
            throw new MustacheException("Failed to get value for " + this.f27670d, e13, this.f27671e);
        }
    }

    @Override // cg.b, bg.a
    public final void h(StringWriter stringWriter) {
        bg.l lVar = this.f27671e;
        String str = this.f27670d;
        if (str != null) {
            try {
                stringWriter.write(lVar.f22775a);
                boolean z13 = this.f27687j;
                if (!z13) {
                    stringWriter.write("{");
                }
                stringWriter.write(this.f27672f);
                stringWriter.write(str);
                if (!z13) {
                    stringWriter.write("}");
                }
                stringWriter.write(lVar.f22776b);
            } catch (IOException e13) {
                throw new MustacheException(e13, lVar);
            }
        }
        i(stringWriter);
    }

    public final void p(Writer writer, String str) {
        char[] cArr;
        if (str != null) {
            if (!this.f27687j) {
                writer.write(str);
                return;
            }
            this.f27675i.getClass();
            char[][] cArr2 = gg.a.f64888a;
            try {
                char[] charArray = str.toCharArray();
                int length = charArray.length;
                int i13 = 0;
                for (int i14 = 0; i14 < length; i14++) {
                    char c13 = charArray[i14];
                    if (c13 <= '`' && (cArr = gg.a.f64888a[c13]) != null) {
                        if (i14 > i13) {
                            writer.write(charArray, i13, i14 - i13);
                        }
                        writer.write(cArr);
                        i13 = i14 + 1;
                    }
                }
                writer.write(charArray, i13, length - i13);
            } catch (IOException e13) {
                throw new MustacheException("Failed to encode value: ".concat(str), e13);
            }
        }
    }

    public final Writer q(Writer writer, Callable callable, List list) {
        String obj;
        ExecutorService executorService = this.f27688k;
        if (executorService != null) {
            try {
                writer.flush();
                gg.c cVar = new gg.c(writer);
                executorService.execute(new w.b(this, writer, callable, cVar, 10));
                return super.b(cVar, list);
            } catch (IOException e13) {
                throw new MustacheException("Failed to flush writer", e13, this.f27671e);
            }
        }
        Object call = callable.call();
        if (call == null) {
            obj = null;
        } else {
            this.f27669c.getClass();
            obj = call.toString();
        }
        p(writer, obj);
        return super.b(writer, list);
    }

    public final void r(Writer writer, Function function, List list) {
        String stringWriter;
        Object apply = function.apply(null);
        if (apply == null) {
            stringWriter = "";
        } else {
            String obj = apply.toString();
            StringWriter stringWriter2 = new StringWriter();
            bg.l lVar = this.f27671e;
            bg.h hVar = new bg.h(new bg.l(lVar.f22778d, "{{", "}}", lVar.f22777c, lVar.f22779e), obj);
            bg.d dVar = this.f27675i;
            c cVar = (c) ((ConcurrentHashMap) dVar.f22759c).computeIfAbsent(hVar, new bg.c(dVar, 0));
            cVar.a();
            cVar.b(stringWriter2, list).close();
            stringWriter = stringWriter2.toString();
        }
        p(writer, stringWriter);
    }
}
