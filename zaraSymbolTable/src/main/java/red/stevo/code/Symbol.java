package red.stevo.code;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Symbol<T> {

    String tokenName; //variable name

    T tokenValues; //value held by the variable

    String tokenDataType; //the variable datatype.

    String Scope; //variable scope.
}
