package le;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.facebook.GraphRequest$ParcelableResourceWithMimeType;
import df.j1;
import df.u0;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import t3.s1;

/* loaded from: classes.dex */
public final class z implements y {

    /* renamed from: a, reason: collision with root package name */
    public final OutputStream f83126a;

    /* renamed from: b, reason: collision with root package name */
    public final u0 f83127b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f83128c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f83129d;

    public z(FilterOutputStream outputStream, u0 u0Var, boolean z13) {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        this.f83126a = outputStream;
        this.f83127b = u0Var;
        this.f83128c = true;
        this.f83129d = z13;
    }

    public static IllegalArgumentException a() {
        return new IllegalArgumentException("value is not a supported type.");
    }

    public final void b(String format, Object... args) {
        String str;
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        boolean z13 = this.f83129d;
        OutputStream outputStream = this.f83126a;
        if (z13) {
            Locale locale = Locale.US;
            Object[] copyOf = Arrays.copyOf(args, args.length);
            String encode = URLEncoder.encode(s1.e(copyOf, copyOf.length, locale, format, "java.lang.String.format(locale, format, *args)"), "UTF-8");
            Intrinsics.checkNotNullExpressionValue(encode, "encode(String.format(Locale.US, format, *args), \"UTF-8\")");
            byte[] bytes = encode.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
            return;
        }
        if (this.f83128c) {
            Charset charset = Charsets.UTF_8;
            byte[] bytes2 = "--".getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes2, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes2);
            str = a0.f83003k;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes3 = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes3, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes3);
            byte[] bytes4 = "\r\n".getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes4, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes4);
            this.f83128c = false;
        }
        Object[] copyOf2 = Arrays.copyOf(args, args.length);
        byte[] bytes5 = s1.d(copyOf2, copyOf2.length, format, "java.lang.String.format(format, *args)").getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes5, "(this as java.lang.String).getBytes(charset)");
        outputStream.write(bytes5);
    }

    public final void c(String key, byte[] bytes) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        d(key, key, "content/unknown");
        this.f83126a.write(bytes);
        h("", new Object[0]);
        j();
        u0 u0Var = this.f83127b;
        if (u0Var == null) {
            return;
        }
        u0Var.a(s1.e(new Object[]{Integer.valueOf(bytes.length)}, 1, Locale.ROOT, "<Data: %d>", "java.lang.String.format(locale, format, *args)"), Intrinsics.n(key, "    "));
    }

    public final void d(String str, String str2, String str3) {
        if (this.f83129d) {
            byte[] bytes = s1.d(new Object[]{str}, 1, "%s=", "java.lang.String.format(format, *args)").getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            this.f83126a.write(bytes);
            return;
        }
        b("Content-Disposition: form-data; name=\"%s\"", str);
        if (str2 != null) {
            b("; filename=\"%s\"", str2);
        }
        h("", new Object[0]);
        if (str3 != null) {
            h("%s: %s", "Content-Type", str3);
        }
        h("", new Object[0]);
    }

    @Override // le.y
    public final void e(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        d(key, null, null);
        h("%s", value);
        j();
        u0 u0Var = this.f83127b;
        if (u0Var == null) {
            return;
        }
        u0Var.a(value, Intrinsics.n(key, "    "));
    }

    public final void f(Uri contentUri, String key, String str) {
        int F;
        long j13;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(contentUri, "contentUri");
        if (str == null) {
            str = "content/unknown";
        }
        d(key, key, str);
        OutputStream outputStream = this.f83126a;
        if (outputStream instanceof l0) {
            Intrinsics.checkNotNullParameter(contentUri, "contentUri");
            Cursor cursor = null;
            try {
                cursor = v.a().getContentResolver().query(contentUri, null, null, null, null);
                if (cursor == null) {
                    j13 = 0;
                } else {
                    int columnIndex = cursor.getColumnIndex("_size");
                    cursor.moveToFirst();
                    long j14 = cursor.getLong(columnIndex);
                    cursor.close();
                    j13 = j14;
                }
                ((l0) outputStream).a(j13);
                F = 0;
            } catch (Throwable th3) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th3;
            }
        } else {
            F = j1.F(v.a().getContentResolver().openInputStream(contentUri), outputStream);
        }
        h("", new Object[0]);
        j();
        u0 u0Var = this.f83127b;
        if (u0Var == null) {
            return;
        }
        u0Var.a(s1.e(new Object[]{Integer.valueOf(F)}, 1, Locale.ROOT, "<Data: %d>", "java.lang.String.format(locale, format, *args)"), Intrinsics.n(key, "    "));
    }

    public final void g(String key, ParcelFileDescriptor descriptor, String str) {
        int F;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (str == null) {
            str = "content/unknown";
        }
        d(key, key, str);
        OutputStream outputStream = this.f83126a;
        if (outputStream instanceof l0) {
            ((l0) outputStream).a(descriptor.getStatSize());
            F = 0;
        } else {
            F = j1.F(new ParcelFileDescriptor.AutoCloseInputStream(descriptor), outputStream);
        }
        h("", new Object[0]);
        j();
        u0 u0Var = this.f83127b;
        if (u0Var == null) {
            return;
        }
        u0Var.a(s1.e(new Object[]{Integer.valueOf(F)}, 1, Locale.ROOT, "<Data: %d>", "java.lang.String.format(locale, format, *args)"), Intrinsics.n(key, "    "));
    }

    public final void h(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        b(format, Arrays.copyOf(args, args.length));
        if (this.f83129d) {
            return;
        }
        b("\r\n", new Object[0]);
    }

    public final void i(String key, Object obj, a0 a0Var) {
        Intrinsics.checkNotNullParameter(key, "key");
        String str = a0.f83002j;
        if (wc.b.w(obj)) {
            e(key, wc.b.e(obj));
            return;
        }
        if (obj instanceof Bitmap) {
            Bitmap bitmap = (Bitmap) obj;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            d(key, key, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.f83126a);
            h("", new Object[0]);
            j();
            u0 u0Var = this.f83127b;
            if (u0Var == null) {
                return;
            }
            u0Var.a("<Image>", Intrinsics.n(key, "    "));
            return;
        }
        if (obj instanceof byte[]) {
            c(key, (byte[]) obj);
            return;
        }
        if (obj instanceof Uri) {
            f((Uri) obj, key, null);
            return;
        }
        if (obj instanceof ParcelFileDescriptor) {
            g(key, (ParcelFileDescriptor) obj, null);
            return;
        }
        if (!(obj instanceof GraphRequest$ParcelableResourceWithMimeType)) {
            throw a();
        }
        GraphRequest$ParcelableResourceWithMimeType graphRequest$ParcelableResourceWithMimeType = (GraphRequest$ParcelableResourceWithMimeType) obj;
        Parcelable f29916b = graphRequest$ParcelableResourceWithMimeType.getF29916b();
        String f29915a = graphRequest$ParcelableResourceWithMimeType.getF29915a();
        if (f29916b instanceof ParcelFileDescriptor) {
            g(key, (ParcelFileDescriptor) f29916b, f29915a);
        } else {
            if (!(f29916b instanceof Uri)) {
                throw a();
            }
            f((Uri) f29916b, key, f29915a);
        }
    }

    public final void j() {
        String str;
        if (!this.f83129d) {
            str = a0.f83003k;
            h("--%s", str);
        } else {
            byte[] bytes = "&".getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            this.f83126a.write(bytes);
        }
    }
}
