package com.pinterest.api.model.deserializer;

import com.pinterest.api.model.pc;
import com.pinterest.api.model.qc;
import com.pinterest.api.model.wy0;
import com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ke0.a;
import ke0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vd0.c;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0017\b\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/pinterest/api/model/deserializer/CollaboratorInviteDeserializer;", "Lke0/a;", "Lcom/pinterest/api/model/qc;", "Lke0/b;", "Lcom/pinterest/deserializers/ModelDeserializerWithSaveAndMerge;", "Lcom/pinterest/api/model/wy0;", "userDeserializer", "<init>", "(Lcom/pinterest/deserializers/ModelDeserializerWithSaveAndMerge;)V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class CollaboratorInviteDeserializer extends a implements b {

    /* renamed from: b, reason: collision with root package name */
    public final ModelDeserializerWithSaveAndMerge f36751b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollaboratorInviteDeserializer(@NotNull ModelDeserializerWithSaveAndMerge<wy0> userDeserializer) {
        super("collaborator_invite");
        Intrinsics.checkNotNullParameter(userDeserializer, "userDeserializer");
        this.f36751b = userDeserializer;
    }

    @Override // ke0.b
    public final List a(vd0.a arr, boolean z13) {
        Intrinsics.checkNotNullParameter(arr, "arr");
        return c(arr);
    }

    @Override // ke0.b
    public final List c(vd0.a arr) {
        Intrinsics.checkNotNullParameter(arr, "arr");
        ArrayList arrayList = new ArrayList();
        Iterator it = arr.iterator();
        while (it.hasNext()) {
            arrayList.add(d((c) it.next()));
        }
        return arrayList;
    }

    @Override // ke0.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final qc d(c json) {
        c m13;
        Intrinsics.checkNotNullParameter(json, "json");
        qc qcVar = new qc();
        qcVar.h(json.o("id", ""));
        c m14 = json.m("invited_by_user");
        ModelDeserializerWithSaveAndMerge modelDeserializerWithSaveAndMerge = this.f36751b;
        if (m14 != null) {
        }
        c m15 = json.m("invited_user");
        if (m15 != null) {
            qcVar.e((wy0) modelDeserializerWithSaveAndMerge.e(m15, true, true));
        }
        qcVar.g(pc.parseString(json.o("status", ""), null));
        if (json.e("board") && (m13 = json.m("board")) != null) {
            m13.n(0L, "id");
        }
        qcVar.a(json.k("access").c(" "));
        return qcVar;
    }
}
