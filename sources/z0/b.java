package z0;

import androidx.camera.core.impl.f;
import c0.z;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f140508a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f140509b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f140510c;

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f140511d;

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f140512e;

    static {
        HashMap hashMap = new HashMap();
        f140508a = hashMap;
        HashMap hashMap2 = new HashMap();
        f140509b = hashMap2;
        HashMap hashMap3 = new HashMap();
        f140510c = hashMap3;
        HashMap hashMap4 = new HashMap();
        f140511d = hashMap4;
        HashMap hashMap5 = new HashMap();
        f140512e = hashMap5;
        hashMap.put(8, new HashSet(Collections.singletonList(8)));
        hashMap.put(10, new HashSet(Collections.singletonList(10)));
        hashMap.put(0, new HashSet(Arrays.asList(8, 10)));
        hashMap2.put(0, new HashSet(Arrays.asList(0, 1, 2, 3, 4)));
        hashMap2.put(1, new HashSet(Collections.singletonList(0)));
        hashMap2.put(2, new HashSet(Arrays.asList(1, 2, 3, 4)));
        hashMap2.put(3, new HashSet(Collections.singletonList(1)));
        hashMap2.put(4, new HashSet(Collections.singletonList(2)));
        hashMap2.put(5, new HashSet(Collections.singletonList(3)));
        hashMap2.put(6, new HashSet(Collections.singletonList(4)));
        hashMap3.put(8, 8);
        hashMap3.put(10, 10);
        hashMap4.put(0, 1);
        hashMap4.put(1, 3);
        hashMap4.put(2, 4);
        hashMap4.put(3, 5);
        hashMap4.put(4, 6);
        HashMap hashMap6 = new HashMap();
        z zVar = z.f24401d;
        hashMap6.put(zVar, 1);
        z zVar2 = z.f24402e;
        hashMap6.put(zVar2, 2);
        z zVar3 = z.f24403f;
        hashMap6.put(zVar3, 4096);
        z zVar4 = z.f24404g;
        hashMap6.put(zVar4, 8192);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(zVar, 1);
        hashMap7.put(zVar2, 2);
        hashMap7.put(zVar3, 4096);
        hashMap7.put(zVar4, 8192);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(zVar, 1);
        hashMap8.put(zVar2, 4);
        hashMap8.put(zVar3, 4096);
        hashMap8.put(zVar4, 16384);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(z.f24405h, Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER));
        hashMap9.put(z.f24406i, Integer.valueOf(BitmapUtils.BITMAP_TO_JPEG_SIZE));
        hashMap5.put("video/hevc", hashMap6);
        hashMap5.put("video/av01", hashMap7);
        hashMap5.put("video/x-vnd.on2.vp9", hashMap8);
        hashMap5.put("video/dolby-vision", hashMap9);
    }

    public static boolean a(f fVar, z zVar) {
        Set set;
        int i13 = fVar.f16835h;
        Set set2 = (Set) f140508a.get(Integer.valueOf(zVar.f24408b));
        return set2 != null && set2.contains(Integer.valueOf(i13)) && (set = (Set) f140509b.get(Integer.valueOf(zVar.f24407a))) != null && set.contains(Integer.valueOf(fVar.f16837j));
    }
}
