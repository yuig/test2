package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/JsonException;", "Lkotlinx/serialization/SerializationException;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class JsonException extends SerializationException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonException(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
