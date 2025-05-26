package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.content.Context;
import com.pinterest.api.model.uq;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public abstract class a2 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a2[] $VALUES;
    public static final a2 AT_MENTION_TAG = new a2() { // from class: com.pinterest.feature.ideaPinCreation.closeup.view.x1

        /* renamed from: a, reason: collision with root package name */
        public final uq f46373a = uq.MENTION;

        @Override // com.pinterest.feature.ideaPinCreation.closeup.view.a2
        public final uq getOverlayType() {
            return this.f46373a;
        }

        @Override // com.pinterest.feature.ideaPinCreation.closeup.view.a2
        public final u2 tagSpec(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(context, "context");
            return gh0.b.H(context);
        }
    };
    public static final a2 PRODUCT_TAG = new a2() { // from class: com.pinterest.feature.ideaPinCreation.closeup.view.y1

        /* renamed from: a, reason: collision with root package name */
        public final uq f46380a = uq.PRODUCT_TAG;

        @Override // com.pinterest.feature.ideaPinCreation.closeup.view.a2
        public final uq getOverlayType() {
            return this.f46380a;
        }

        @Override // com.pinterest.feature.ideaPinCreation.closeup.view.a2
        public final u2 tagSpec(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(context, "context");
            return u2.a(gh0.b.H(context), 0, 0, 0, 0.0f, bs1.c.V(context, eo1.c.space_400), bs1.c.V(context, eo1.c.space_400), Integer.valueOf(sm1.b.ic_tag_gestalt), 0, 399);
        }
    };
    public static final a2 VTO_MAKEUP_PRODUCT_TAG = new a2() { // from class: com.pinterest.feature.ideaPinCreation.closeup.view.z1

        /* renamed from: a, reason: collision with root package name */
        public final uq f46414a = uq.VTO_PRODUCT_TAG;

        @Override // com.pinterest.feature.ideaPinCreation.closeup.view.a2
        public final uq getOverlayType() {
            return this.f46414a;
        }

        @Override // com.pinterest.feature.ideaPinCreation.closeup.view.a2
        public final u2 tagSpec(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(context, "context");
            return u2.a(gh0.b.H(context), 0, 0, 0, 0.0f, bs1.c.V(context, eo1.c.space_600), bs1.c.V(context, eo1.c.space_600), Integer.valueOf(sm1.b.ic_lips_gestalt), 2, RecyclerViewTypes.VIEW_TYPE_BOARD_CONVERSATION_THREAD);
        }
    };

    private static final /* synthetic */ a2[] $values() {
        return new a2[]{AT_MENTION_TAG, PRODUCT_TAG, VTO_MAKEUP_PRODUCT_TAG};
    }

    static {
        a2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    public /* synthetic */ a2(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static a2 valueOf(String str) {
        return (a2) Enum.valueOf(a2.class, str);
    }

    public static a2[] values() {
        return (a2[]) $VALUES.clone();
    }

    @NotNull
    public abstract uq getOverlayType();

    @NotNull
    public abstract u2 tagSpec(@NotNull Context context);

    private a2(String str, int i13) {
    }
}
