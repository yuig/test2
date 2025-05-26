package oi;

import android.os.Bundle;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.EnumMap;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: f, reason: collision with root package name */
    public static final m f94941f = new m((Boolean) null, 100, (Boolean) null, (String) null);

    /* renamed from: a, reason: collision with root package name */
    public final int f94942a;

    /* renamed from: b, reason: collision with root package name */
    public final String f94943b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f94944c;

    /* renamed from: d, reason: collision with root package name */
    public final String f94945d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumMap f94946e;

    public m(Boolean bool, int i13, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(f5.class);
        this.f94946e = enumMap;
        enumMap.put((EnumMap) f5.AD_USER_DATA, (f5) bool);
        this.f94942a = i13;
        this.f94943b = c();
        this.f94944c = bool2;
        this.f94945d = str;
    }

    public static m a(int i13, Bundle bundle) {
        if (bundle == null) {
            return new m((Boolean) null, i13, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(f5.class);
        for (f5 f5Var : e5.DMA.zza()) {
            enumMap.put((EnumMap) f5Var, (f5) g5.f(bundle.getString(f5Var.zze)));
        }
        return new m(enumMap, i13, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static m b(String str) {
        if (str == null || str.length() <= 0) {
            return f94941f;
        }
        String[] split = str.split(":");
        int parseInt = Integer.parseInt(split[0]);
        EnumMap enumMap = new EnumMap(f5.class);
        f5[] zza = e5.DMA.zza();
        int length = zza.length;
        int i13 = 1;
        int i14 = 0;
        while (true) {
            Boolean bool = null;
            if (i14 >= length) {
                return new m(enumMap, parseInt, (Boolean) null, (String) null);
            }
            f5 f5Var = zza[i14];
            int i15 = i13 + 1;
            char charAt = split[i13].charAt(0);
            g5 g5Var = g5.f94790c;
            if (charAt == '0') {
                bool = Boolean.FALSE;
            } else if (charAt == '1') {
                bool = Boolean.TRUE;
            }
            enumMap.put((EnumMap) f5Var, (f5) bool);
            i14++;
            i13 = i15;
        }
    }

    public final String c() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f94942a);
        for (f5 f5Var : e5.DMA.zza()) {
            sb3.append(":");
            Boolean bool = (Boolean) this.f94946e.get(f5Var);
            g5 g5Var = g5.f94790c;
            sb3.append(bool == null ? '-' : bool.booleanValue() ? '1' : '0');
        }
        return sb3.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!this.f94943b.equalsIgnoreCase(mVar.f94943b)) {
            return false;
        }
        Boolean bool = this.f94944c;
        Boolean bool2 = mVar.f94944c;
        if (bool != bool2 && (bool == null || !bool.equals(bool2))) {
            return false;
        }
        String str = this.f94945d;
        String str2 = mVar.f94945d;
        return str == str2 || (str != null && str.equals(str2));
    }

    public final int hashCode() {
        Boolean bool = this.f94944c;
        int i13 = bool == null ? 3 : bool == Boolean.TRUE ? 7 : 13;
        String str = this.f94945d;
        return ((str == null ? 17 : str.hashCode()) * RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_IMAGE) + (i13 * 29) + this.f94943b.hashCode();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("source=");
        sb3.append(g5.a(this.f94942a));
        for (f5 f5Var : e5.DMA.zza()) {
            sb3.append(",");
            sb3.append(f5Var.zze);
            sb3.append("=");
            Boolean bool = (Boolean) this.f94946e.get(f5Var);
            if (bool == null) {
                sb3.append("uninitialized");
            } else {
                sb3.append(bool.booleanValue() ? "granted" : "denied");
            }
        }
        Boolean bool2 = this.f94944c;
        if (bool2 != null) {
            sb3.append(",isDmaRegion=");
            sb3.append(bool2);
        }
        String str = this.f94945d;
        if (str != null) {
            sb3.append(",cpsDisplayStr=");
            sb3.append(str);
        }
        return sb3.toString();
    }

    public m(EnumMap enumMap, int i13, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(f5.class);
        this.f94946e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f94942a = i13;
        this.f94943b = c();
        this.f94944c = bool;
        this.f94945d = str;
    }
}
