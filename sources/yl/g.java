package yl;

import androidx.camera.core.impl.x2;
import com.google.firebase.encoders.EncodingException;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import l0.k;

/* loaded from: classes3.dex */
public final class g implements vl.d {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f139275f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    public static final vl.b f139276g;

    /* renamed from: h, reason: collision with root package name */
    public static final vl.b f139277h;

    /* renamed from: i, reason: collision with root package name */
    public static final xl.a f139278i;

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f139279a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f139280b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f139281c;

    /* renamed from: d, reason: collision with root package name */
    public final vl.c f139282d;

    /* renamed from: e, reason: collision with root package name */
    public final i f139283e = new i(this);

    static {
        x2 a13 = vl.b.a("key");
        k k13 = k.k();
        k13.f81235b = 1;
        a13.h(k13.j());
        f139276g = a13.a();
        x2 a14 = vl.b.a("value");
        k k14 = k.k();
        k14.f81235b = 2;
        a14.h(k14.j());
        f139277h = a14.a();
        f139278i = new xl.a(1);
    }

    public g(ByteArrayOutputStream byteArrayOutputStream, Map map, Map map2, vl.c cVar) {
        this.f139279a = byteArrayOutputStream;
        this.f139280b = map;
        this.f139281c = map2;
        this.f139282d = cVar;
    }

    public static int f(vl.b bVar) {
        e eVar = (e) ((Annotation) bVar.f126103b.get(e.class));
        if (eVar != null) {
            return ((a) eVar).f139271a;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public final g a(vl.b bVar, Object obj) {
        d(bVar, obj, true);
        return this;
    }

    public final void b(vl.b bVar, int i13, boolean z13) {
        if (z13 && i13 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) bVar.f126103b.get(e.class));
        if (eVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        a aVar = (a) eVar;
        int i14 = f.f139274a[aVar.f139272b.ordinal()];
        int i15 = aVar.f139271a;
        if (i14 == 1) {
            g(i15 << 3);
            g(i13);
        } else if (i14 == 2) {
            g(i15 << 3);
            g((i13 << 1) ^ (i13 >> 31));
        } else {
            if (i14 != 3) {
                return;
            }
            g((i15 << 3) | 5);
            this.f139279a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i13).array());
        }
    }

    public final void c(vl.b bVar, long j13, boolean z13) {
        if (z13 && j13 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) bVar.f126103b.get(e.class));
        if (eVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        a aVar = (a) eVar;
        int i13 = f.f139274a[aVar.f139272b.ordinal()];
        int i14 = aVar.f139271a;
        if (i13 == 1) {
            g(i14 << 3);
            h(j13);
        } else if (i13 == 2) {
            g(i14 << 3);
            h((j13 >> 63) ^ (j13 << 1));
        } else {
            if (i13 != 3) {
                return;
            }
            g((i14 << 3) | 1);
            this.f139279a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j13).array());
        }
    }

    public final void d(vl.b bVar, Object obj, boolean z13) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z13 && charSequence.length() == 0) {
                return;
            }
            g((f(bVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f139275f);
            g(bytes.length);
            this.f139279a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                d(bVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                e(f139278i, bVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (z13 && doubleValue == 0.0d) {
                return;
            }
            g((f(bVar) << 3) | 1);
            this.f139279a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z13 && floatValue == 0.0f) {
                return;
            }
            g((f(bVar) << 3) | 5);
            this.f139279a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            c(bVar, ((Number) obj).longValue(), z13);
            return;
        }
        if (obj instanceof Boolean) {
            b(bVar, ((Boolean) obj).booleanValue() ? 1 : 0, z13);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z13 && bArr.length == 0) {
                return;
            }
            g((f(bVar) << 3) | 2);
            g(bArr.length);
            this.f139279a.write(bArr);
            return;
        }
        vl.c cVar = (vl.c) this.f139280b.get(obj.getClass());
        if (cVar != null) {
            e(cVar, bVar, obj, z13);
            return;
        }
        vl.e eVar = (vl.e) this.f139281c.get(obj.getClass());
        if (eVar != null) {
            i iVar = this.f139283e;
            iVar.f139285a = false;
            iVar.f139287c = bVar;
            iVar.f139286b = z13;
            eVar.a(obj, iVar);
            return;
        }
        if (obj instanceof c) {
            b(bVar, ((c) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            b(bVar, ((Enum) obj).ordinal(), true);
        } else {
            e(this.f139282d, bVar, obj, z13);
        }
    }

    public final void e(vl.c cVar, vl.b bVar, Object obj, boolean z13) {
        b bVar2 = new b();
        bVar2.f139273a = 0L;
        try {
            OutputStream outputStream = this.f139279a;
            this.f139279a = bVar2;
            try {
                cVar.a(obj, this);
                this.f139279a = outputStream;
                long j13 = bVar2.f139273a;
                bVar2.close();
                if (z13 && j13 == 0) {
                    return;
                }
                g((f(bVar) << 3) | 2);
                h(j13);
                cVar.a(obj, this);
            } catch (Throwable th3) {
                this.f139279a = outputStream;
                throw th3;
            }
        } catch (Throwable th4) {
            try {
                bVar2.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    public final void g(int i13) {
        while ((i13 & (-128)) != 0) {
            this.f139279a.write((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
            i13 >>>= 7;
        }
        this.f139279a.write(i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
    }

    public final void h(long j13) {
        while (((-128) & j13) != 0) {
            this.f139279a.write((((int) j13) & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
            j13 >>>= 7;
        }
        this.f139279a.write(((int) j13) & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
    }
}
