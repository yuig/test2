package x02;

import android.os.Parcel;
import com.pinterest.repository.TypedId;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y1 {

    /* renamed from: d, reason: collision with root package name */
    public static final y1 f131537d = new y1(new TypedId[0], null, 0);

    /* renamed from: a, reason: collision with root package name */
    public final TypedId[] f131538a;

    /* renamed from: b, reason: collision with root package name */
    public final String f131539b;

    /* renamed from: c, reason: collision with root package name */
    public final long f131540c;

    public y1(mc.a entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        byte[] data = entry.f86879a;
        Intrinsics.checkNotNullExpressionValue(data, "data");
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(data, 0, data.length);
        obtain.setDataPosition(0);
        Object[] createTypedArray = obtain.createTypedArray(TypedId.CREATOR);
        Intrinsics.f(createTypedArray);
        obtain.recycle();
        this.f131538a = (TypedId[]) createTypedArray;
        this.f131539b = entry.f86880b;
        this.f131540c = entry.f86882d;
    }

    public y1(TypedId[] modelTypedIds, String str, long j13) {
        Intrinsics.checkNotNullParameter(modelTypedIds, "modelTypedIds");
        this.f131538a = modelTypedIds;
        this.f131539b = str;
        this.f131540c = System.currentTimeMillis() + j13;
    }
}
