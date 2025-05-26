package com.pinterest.api.model.deserializer;

import com.pinterest.api.model.gw;
import com.pinterest.api.model.k8;
import dl1.l;
import dl1.t;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ke0.a;
import ke0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vb0.g;
import vd0.c;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B5\b\u0007\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/pinterest/api/model/deserializer/BoardInviteDeserializer;", "Lke0/a;", "Lcom/pinterest/api/model/k8;", "Lke0/b;", "Lse2/a;", "Ldl1/t;", "Lcom/pinterest/api/model/wy0;", "userRepository", "Lcom/pinterest/api/model/deserializer/BoardDeserializer;", "boardDeserializer", "Lcom/pinterest/api/model/deserializer/UserDeserializer;", "userDeserializer", "Lcom/pinterest/api/model/gw;", "modelHelper", "<init>", "(Lse2/a;Lcom/pinterest/api/model/deserializer/BoardDeserializer;Lcom/pinterest/api/model/deserializer/UserDeserializer;Lcom/pinterest/api/model/gw;)V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class BoardInviteDeserializer extends a implements b {

    /* renamed from: b, reason: collision with root package name */
    public final se2.a f36745b;

    /* renamed from: c, reason: collision with root package name */
    public final BoardDeserializer f36746c;

    /* renamed from: d, reason: collision with root package name */
    public final UserDeserializer f36747d;

    /* renamed from: e, reason: collision with root package name */
    public final gw f36748e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardInviteDeserializer(@NotNull se2.a userRepository, @NotNull BoardDeserializer boardDeserializer, @NotNull UserDeserializer userDeserializer, @NotNull gw modelHelper) {
        super("board_invite");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(boardDeserializer, "boardDeserializer");
        Intrinsics.checkNotNullParameter(userDeserializer, "userDeserializer");
        Intrinsics.checkNotNullParameter(modelHelper, "modelHelper");
        this.f36745b = userRepository;
        this.f36746c = boardDeserializer;
        this.f36747d = userDeserializer;
        this.f36748e = modelHelper;
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
        int d2 = arr.d();
        for (int i13 = 0; i13 < d2; i13++) {
            c b13 = arr.b(i13);
            Intrinsics.checkNotNullExpressionValue(b13, "getJsonObject(...)");
            arrayList.add(d(b13));
        }
        return arrayList;
    }

    @Override // ke0.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final k8 d(c json) {
        String str;
        String o13;
        Intrinsics.checkNotNullParameter(json, "json");
        c m13 = json.m("board");
        String str2 = "0";
        if (m13 == null || (str = m13.o("id", "0")) == null) {
            str = "0";
        }
        if (m13 != null) {
            this.f36746c.e(m13, true, true);
        }
        c m14 = json.m("invited_by_user");
        if (m14 != null && (o13 = m14.o("id", "0")) != null) {
            str2 = o13;
        }
        if (m14 != null) {
            ((l) ((t) ((bf2.b) this.f36745b).get())).W(this.f36747d.e(m14, false, true));
        }
        k8 k8Var = new k8(str2, str);
        Date c13 = g.c(json.o("created_at", ""), false);
        Intrinsics.checkNotNullExpressionValue(c13, "stringToDate(...)");
        k8Var.createdAt = c13;
        Boolean h10 = json.h("is_acceptable", Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(h10, "optBoolean(...)");
        k8Var.c(h10.booleanValue());
        k8Var.e(json.o("status", ""));
        k8Var.g(json.o("type", ""));
        k8Var.message = json.o("message", "");
        return k8Var;
    }
}
