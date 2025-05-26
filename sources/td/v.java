package td;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: d, reason: collision with root package name */
    public static final Map f117443d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f117444a = true;

    /* renamed from: b, reason: collision with root package name */
    public Map f117445b = f117443d;

    /* renamed from: c, reason: collision with root package name */
    public boolean f117446c = true;

    static {
        String property = System.getProperty("http.agent");
        if (!TextUtils.isEmpty(property)) {
            int length = property.length();
            StringBuilder sb3 = new StringBuilder(property.length());
            for (int i13 = 0; i13 < length; i13++) {
                char charAt = property.charAt(i13);
                if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                    sb3.append(charAt);
                } else {
                    sb3.append('?');
                }
            }
            property = sb3.toString();
        }
        HashMap hashMap = new HashMap(2);
        if (!TextUtils.isEmpty(property)) {
            hashMap.put("User-Agent", Collections.singletonList(new w(property)));
        }
        f117443d = Collections.unmodifiableMap(hashMap);
    }

    public final void a() {
        if (this.f117444a) {
            this.f117444a = false;
            HashMap hashMap = new HashMap(this.f117445b.size());
            for (Map.Entry entry : this.f117445b.entrySet()) {
                hashMap.put(entry.getKey(), new ArrayList((Collection) entry.getValue()));
            }
            this.f117445b = hashMap;
        }
    }
}
