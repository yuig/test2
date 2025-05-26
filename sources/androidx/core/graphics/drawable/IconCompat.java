package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import c5.y;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f17930k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f17931a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17932b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f17933c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f17934d;

    /* renamed from: e, reason: collision with root package name */
    public int f17935e;

    /* renamed from: f, reason: collision with root package name */
    public int f17936f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f17937g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f17938h;

    /* renamed from: i, reason: collision with root package name */
    public String f17939i;

    /* renamed from: j, reason: collision with root package name */
    public String f17940j;

    public IconCompat() {
        this.f17931a = -1;
        this.f17933c = null;
        this.f17934d = null;
        this.f17935e = 0;
        this.f17936f = 0;
        this.f17937g = null;
        this.f17938h = f17930k;
        this.f17939i = null;
    }

    public static IconCompat a(Resources resources, String str, int i13) {
        str.getClass();
        if (i13 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f17935e = i13;
        if (resources != null) {
            try {
                iconCompat.f17932b = resources.getResourceName(i13);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f17932b = str;
        }
        iconCompat.f17940j = str;
        return iconCompat;
    }

    public final int b() {
        int i13 = this.f17931a;
        if (i13 != -1) {
            if (i13 == 2) {
                return this.f17935e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i14 = Build.VERSION.SDK_INT;
        Object obj = this.f17932b;
        if (i14 >= 28) {
            return y.c(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (IllegalAccessException e13) {
            Log.e("IconCompat", "Unable to get icon resource", e13);
            return 0;
        } catch (NoSuchMethodException e14) {
            Log.e("IconCompat", "Unable to get icon resource", e14);
            return 0;
        } catch (InvocationTargetException e15) {
            Log.e("IconCompat", "Unable to get icon resource", e15);
            return 0;
        }
    }

    public final String c() {
        int i13 = this.f17931a;
        if (i13 != -1) {
            if (i13 == 2) {
                String str = this.f17940j;
                return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f17932b).split(":", -1)[0] : this.f17940j;
            }
            throw new IllegalStateException("called getResPackage() on " + this);
        }
        int i14 = Build.VERSION.SDK_INT;
        Object obj = this.f17932b;
        if (i14 >= 28) {
            return y.d(obj);
        }
        try {
            return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException e13) {
            Log.e("IconCompat", "Unable to get icon package", e13);
            return null;
        } catch (NoSuchMethodException e14) {
            Log.e("IconCompat", "Unable to get icon package", e14);
            return null;
        } catch (InvocationTargetException e15) {
            Log.e("IconCompat", "Unable to get icon package", e15);
            return null;
        }
    }

    public final int d() {
        int i13 = this.f17931a;
        if (i13 != -1) {
            return i13;
        }
        int i14 = Build.VERSION.SDK_INT;
        Object obj = this.f17932b;
        if (i14 >= 28) {
            return y.j(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (IllegalAccessException e13) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e13);
            return -1;
        } catch (NoSuchMethodException e14) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e14);
            return -1;
        } catch (InvocationTargetException e15) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e15);
            return -1;
        }
    }

    public final Uri e() {
        int i13 = this.f17931a;
        if (i13 != -1) {
            if (i13 == 4 || i13 == 6) {
                return Uri.parse((String) this.f17932b);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        int i14 = Build.VERSION.SDK_INT;
        Object obj = this.f17932b;
        if (i14 >= 28) {
            return y.k(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException e13) {
            Log.e("IconCompat", "Unable to get icon uri", e13);
            return null;
        } catch (NoSuchMethodException e14) {
            Log.e("IconCompat", "Unable to get icon uri", e14);
            return null;
        } catch (InvocationTargetException e15) {
            Log.e("IconCompat", "Unable to get icon uri", e15);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Icon f(android.content.Context r5) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.f(android.content.Context):android.graphics.drawable.Icon");
    }

    public final String toString() {
        String str;
        if (this.f17931a == -1) {
            return String.valueOf(this.f17932b);
        }
        StringBuilder sb3 = new StringBuilder("Icon(typ=");
        switch (this.f17931a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb3.append(str);
        switch (this.f17931a) {
            case 1:
            case 5:
                sb3.append(" size=");
                sb3.append(((Bitmap) this.f17932b).getWidth());
                sb3.append("x");
                sb3.append(((Bitmap) this.f17932b).getHeight());
                break;
            case 2:
                sb3.append(" pkg=");
                sb3.append(this.f17940j);
                sb3.append(" id=");
                sb3.append(String.format("0x%08x", Integer.valueOf(b())));
                break;
            case 3:
                sb3.append(" len=");
                sb3.append(this.f17935e);
                if (this.f17936f != 0) {
                    sb3.append(" off=");
                    sb3.append(this.f17936f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb3.append(" uri=");
                sb3.append(this.f17932b);
                break;
        }
        if (this.f17937g != null) {
            sb3.append(" tint=");
            sb3.append(this.f17937g);
        }
        if (this.f17938h != f17930k) {
            sb3.append(" mode=");
            sb3.append(this.f17938h);
        }
        sb3.append(")");
        return sb3.toString();
    }

    public IconCompat(int i13) {
        this.f17933c = null;
        this.f17934d = null;
        this.f17935e = 0;
        this.f17936f = 0;
        this.f17937g = null;
        this.f17938h = f17930k;
        this.f17939i = null;
        this.f17931a = i13;
    }
}
