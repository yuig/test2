package com.pinterest.api.model;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/pinterest/api/model/tx;", "", "", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "com/pinterest/api/model/sx", "SYSTEM_RECOMMENDATION", "LEGAL", "BOARD_ACTIVITY", "BOARD_ACTIVITY_REACT", "BOARD_ACTIVITY_COMMENT_REACT", "BOARD_ACTIVITY_COMMENT_CREATE", "BOARD_ACTIVITY_MENTION", "FEATURED_EDITORIAL_BOARDS", "AUTOMAGICAL_BOARDS", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class tx extends Enum<tx> {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ tx[] $VALUES;

    @NotNull
    public static final sx Companion;
    private final int value;

    @om.b("0")
    public static final tx SYSTEM_RECOMMENDATION = new tx("SYSTEM_RECOMMENDATION", 0, 0);

    @om.b("19")
    public static final tx LEGAL = new tx("LEGAL", 1, 19);

    @om.b("32")
    public static final tx BOARD_ACTIVITY = new tx("BOARD_ACTIVITY", 2, 32);

    @om.b("33")
    public static final tx BOARD_ACTIVITY_REACT = new tx("BOARD_ACTIVITY_REACT", 3, 33);

    @om.b("34")
    public static final tx BOARD_ACTIVITY_COMMENT_REACT = new tx("BOARD_ACTIVITY_COMMENT_REACT", 4, 34);

    @om.b("35")
    public static final tx BOARD_ACTIVITY_COMMENT_CREATE = new tx("BOARD_ACTIVITY_COMMENT_CREATE", 5, 35);

    @om.b("36")
    public static final tx BOARD_ACTIVITY_MENTION = new tx("BOARD_ACTIVITY_MENTION", 6, 36);

    @om.b("174")
    public static final tx FEATURED_EDITORIAL_BOARDS = new tx("FEATURED_EDITORIAL_BOARDS", 7, RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE_FULL_SPAN);

    @om.b("187")
    public static final tx AUTOMAGICAL_BOARDS = new tx("AUTOMAGICAL_BOARDS", 8, RecyclerViewTypes.VIEW_TYPE_BUBBLE_EDITORIAL_CARD);

    private static final /* synthetic */ tx[] $values() {
        return new tx[]{SYSTEM_RECOMMENDATION, LEGAL, BOARD_ACTIVITY, BOARD_ACTIVITY_REACT, BOARD_ACTIVITY_COMMENT_REACT, BOARD_ACTIVITY_COMMENT_CREATE, BOARD_ACTIVITY_MENTION, FEATURED_EDITORIAL_BOARDS, AUTOMAGICAL_BOARDS};
    }

    static {
        tx[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new sx(null);
    }

    private tx(String str, int i13, int i14) {
        super(str, i13);
        this.value = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static tx valueOf(String str) {
        return (tx) Enum.valueOf(tx.class, str);
    }

    public static tx[] values() {
        return (tx[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
