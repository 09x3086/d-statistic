package model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * QualitativeVariable class.
 * 質的変数　クラス
 *
 * @author 09x3086
 */
@AllArgsConstructor
@Getter
public class QualitativeVariable<T extends Number> {

  T qualitativeVariable;
}
