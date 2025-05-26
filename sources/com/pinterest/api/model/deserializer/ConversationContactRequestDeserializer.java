package com.pinterest.api.model.deserializer;

import android.util.LruCache;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.fw;
import com.pinterest.api.model.ue;
import com.pinterest.api.model.ve;
import java.util.ArrayList;
import java.util.List;
import ke0.a;
import ke0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vb0.g;
import vd0.c;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/api/model/deserializer/ConversationContactRequestDeserializer;", "Lke0/a;", "Lcom/pinterest/api/model/ve;", "Lke0/b;", "Lcom/pinterest/api/model/deserializer/BoardDeserializer;", "boardDeserializer", "Lcom/pinterest/api/model/deserializer/ConversationDeserializer;", "conversationDeserializer", "<init>", "(Lcom/pinterest/api/model/deserializer/BoardDeserializer;Lcom/pinterest/api/model/deserializer/ConversationDeserializer;)V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ConversationContactRequestDeserializer extends a implements b {

    /* renamed from: b, reason: collision with root package name */
    public final BoardDeserializer f36753b;

    /* renamed from: c, reason: collision with root package name */
    public final ConversationDeserializer f36754c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationContactRequestDeserializer(@NotNull BoardDeserializer boardDeserializer, @NotNull ConversationDeserializer conversationDeserializer) {
        super("contactrequest");
        Intrinsics.checkNotNullParameter(boardDeserializer, "boardDeserializer");
        Intrinsics.checkNotNullParameter(conversationDeserializer, "conversationDeserializer");
        this.f36753b = boardDeserializer;
        this.f36754c = conversationDeserializer;
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
    public final ve d(c json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ve veVar = new ve();
        veVar.g(json.o("id", "0"));
        veVar.e(json.h("read", Boolean.FALSE));
        veVar.c(g.c(json.o("created_at", ""), false));
        c json2 = json.m("conversation");
        if (json2 != null) {
            veVar.f42835d = json2.o("id", "0");
            ConversationDeserializer conversationDeserializer = this.f36754c;
            conversationDeserializer.getClass();
            Intrinsics.checkNotNullParameter(json2, "json");
            ue e13 = conversationDeserializer.e(json2, true, false);
            if (e13.getId() != null) {
                fw.f37821a.getClass();
                LruCache lruCache = ew.f37357a;
                if (e13.getId() != null) {
                    LruCache lruCache2 = ew.f37369m;
                    synchronized (lruCache2) {
                        lruCache2.put(e13.getId(), e13);
                    }
                }
            }
        } else {
            veVar.f42835d = "0";
        }
        c m13 = json.m("board");
        if (m13 != null) {
            m13.o("id", "0");
            this.f36753b.e(m13, true, true);
        }
        c m14 = json.m("sender");
        if (m14 != null) {
            m14.o("id", "0");
            UserDeserializer.f36811e.getClass();
            UserDeserializer userDeserializer = UserDeserializer.f36812f;
            if (userDeserializer == null) {
                Intrinsics.r("INSTANCE");
                throw null;
            }
            userDeserializer.e(m14, true, true);
        }
        return veVar;
    }
}
