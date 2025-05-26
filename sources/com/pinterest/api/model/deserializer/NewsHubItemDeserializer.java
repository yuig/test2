package com.pinterest.api.model.deserializer;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.zs;
import com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge;
import dl1.s;
import java.util.ArrayList;
import java.util.List;
import ke0.a;
import ke0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vd0.c;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003BO\b\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/pinterest/api/model/deserializer/NewsHubItemDeserializer;", "Lke0/a;", "Lcom/pinterest/api/model/qx;", "Lke0/b;", "Lcom/pinterest/deserializers/ModelDeserializerWithSaveAndMerge;", "Lcom/pinterest/api/model/f30;", "pinDeserializer", "Lcom/pinterest/api/model/v7;", "boardDeserializer", "Lcom/pinterest/api/model/zs;", "interestDeserializer", "Lcom/pinterest/api/model/vh;", "dynamicStoryDeserializer", "Lcom/pinterest/api/model/az0;", "userDidItDataDeserializer", "<init>", "(Lcom/pinterest/deserializers/ModelDeserializerWithSaveAndMerge;Lcom/pinterest/deserializers/ModelDeserializerWithSaveAndMerge;Lcom/pinterest/deserializers/ModelDeserializerWithSaveAndMerge;Lcom/pinterest/deserializers/ModelDeserializerWithSaveAndMerge;Lke0/a;)V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class NewsHubItemDeserializer extends a implements b {

    /* renamed from: b, reason: collision with root package name */
    public final ModelDeserializerWithSaveAndMerge f36804b;

    /* renamed from: c, reason: collision with root package name */
    public final ModelDeserializerWithSaveAndMerge f36805c;

    /* renamed from: d, reason: collision with root package name */
    public final ModelDeserializerWithSaveAndMerge f36806d;

    /* renamed from: e, reason: collision with root package name */
    public final ModelDeserializerWithSaveAndMerge f36807e;

    /* renamed from: f, reason: collision with root package name */
    public final a f36808f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsHubItemDeserializer(@NotNull ModelDeserializerWithSaveAndMerge<f30> pinDeserializer, @NotNull ModelDeserializerWithSaveAndMerge<v7> boardDeserializer, @NotNull ModelDeserializerWithSaveAndMerge<zs> interestDeserializer, @NotNull ModelDeserializerWithSaveAndMerge<vh> dynamicStoryDeserializer, @NotNull a userDidItDataDeserializer) {
        super("news");
        Intrinsics.checkNotNullParameter(pinDeserializer, "pinDeserializer");
        Intrinsics.checkNotNullParameter(boardDeserializer, "boardDeserializer");
        Intrinsics.checkNotNullParameter(interestDeserializer, "interestDeserializer");
        Intrinsics.checkNotNullParameter(dynamicStoryDeserializer, "dynamicStoryDeserializer");
        Intrinsics.checkNotNullParameter(userDidItDataDeserializer, "userDidItDataDeserializer");
        this.f36804b = pinDeserializer;
        this.f36805c = boardDeserializer;
        this.f36806d = interestDeserializer;
        this.f36807e = dynamicStoryDeserializer;
        this.f36808f = userDidItDataDeserializer;
    }

    @Override // ke0.b
    public final List a(vd0.a arr, boolean z13) {
        Intrinsics.checkNotNullParameter(arr, "arr");
        ArrayList arrayList = new ArrayList();
        int d2 = arr.d();
        for (int i13 = 0; i13 < d2; i13++) {
            c b13 = arr.b(i13);
            if (b13 != null) {
                arrayList.add(e(b13, z13));
            }
        }
        return arrayList;
    }

    @Override // ke0.b
    public final List c(vd0.a arr) {
        Intrinsics.checkNotNullParameter(arr, "arr");
        return a(arr, true);
    }

    @Override // ke0.a
    public final s d(c json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return e(json, false);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0162 A[Catch: Exception -> 0x0179, TryCatch #0 {Exception -> 0x0179, blocks: (B:69:0x0086, B:70:0x0095, B:72:0x009b, B:79:0x00ab, B:81:0x00b3, B:82:0x00b7, B:83:0x00bd, B:88:0x0162, B:90:0x016e, B:93:0x00c8, B:95:0x00e8, B:97:0x00f0, B:99:0x00fa, B:104:0x0105, B:107:0x010e, B:108:0x0116, B:111:0x011f, B:112:0x012a, B:115:0x0134, B:116:0x013c, B:119:0x0146, B:120:0x014e, B:123:0x0158), top: B:68:0x0086 }] */
    /* JADX WARN: Type inference failed for: r7v16, types: [dl1.s] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v22, types: [com.pinterest.api.model.rx] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.pinterest.api.model.qx e(vd0.c r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.api.model.deserializer.NewsHubItemDeserializer.e(vd0.c, boolean):com.pinterest.api.model.qx");
    }
}
