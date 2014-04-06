/* -----------------------------------------------------------------------------
 * Rule_definition.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.Parser 2.3
 * Produced : Fri Jun 07 20:56:54 MUT 2013
 *
 * -----------------------------------------------------------------------------
 */

package com.litecoding.andorstrail.res.parser;

import java.util.ArrayList;

final public class Rule_definition extends Rule
{
  private Rule_definition(String spelling, ArrayList<Rule> rules)
  {
    super(spelling, rules);
  }

  public Object accept(Visitor visitor)
  {
    return visitor.visit(this);
  }

  public static Rule_definition parse(ParserContext context)
  {
    context.push("definition");

    boolean parsed = true;
    int s0 = context.index;
    ArrayList<Rule> e0 = new ArrayList<Rule>();
    Rule rule;

    parsed = false;
    if (!parsed)
    {
      {
        ArrayList<Rule> e1 = new ArrayList<Rule>();
        int s1 = context.index;
        parsed = true;
        if (parsed)
        {
          boolean f1 = true;
          int c1 = 0;
          for (int i1 = 0; i1 < 1 && f1; i1++)
          {
            rule = Rule_CRL_BRACKET_L.parse(context);
            if ((f1 = rule != null))
            {
              e1.add(rule);
              c1++;
            }
          }
          parsed = c1 == 1;
        }
        if (parsed)
        {
          boolean f1 = true;
          @SuppressWarnings("unused")
          int c1 = 0;
          while (f1)
          {
            rule = Rule_SP.parse(context);
            if ((f1 = rule != null))
            {
              e1.add(rule);
              c1++;
            }
          }
          parsed = true;
        }
        if (parsed)
        {
          boolean f1 = true;
          @SuppressWarnings("unused")
          int c1 = 0;
          while (f1)
          {
            int g1 = context.index;
            parsed = false;
            if (!parsed)
            {
              {
                ArrayList<Rule> e2 = new ArrayList<Rule>();
                int s2 = context.index;
                parsed = true;
                if (parsed)
                {
                  boolean f2 = true;
                  @SuppressWarnings("unused")
                  int c2 = 0;
                  while (f2)
                  {
                    rule = Rule_SP.parse(context);
                    if ((f2 = rule != null))
                    {
                      e2.add(rule);
                      c2++;
                    }
                  }
                  parsed = true;
                }
                if (parsed)
                {
                  boolean f2 = true;
                  int c2 = 0;
                  for (int i2 = 0; i2 < 1 && f2; i2++)
                  {
                    int g2 = context.index;
                    parsed = false;
                    if (!parsed)
                    {
                      {
                        ArrayList<Rule> e3 = new ArrayList<Rule>();
                        int s3 = context.index;
                        parsed = true;
                        if (parsed)
                        {
                          boolean f3 = true;
                          int c3 = 0;
                          for (int i3 = 0; i3 < 1 && f3; i3++)
                          {
                            int g3 = context.index;
                            parsed = false;
                            if (!parsed)
                            {
                              {
                                ArrayList<Rule> e4 = new ArrayList<Rule>();
                                int s4 = context.index;
                                parsed = true;
                                if (parsed)
                                {
                                  boolean f4 = true;
                                  int c4 = 0;
                                  for (int i4 = 0; i4 < 1 && f4; i4++)
                                  {
                                    rule = Rule_arrVal.parse(context);
                                    if ((f4 = rule != null))
                                    {
                                      e4.add(rule);
                                      c4++;
                                    }
                                  }
                                  parsed = c4 == 1;
                                }
                                if (parsed)
                                {
                                  boolean f4 = true;
                                  @SuppressWarnings("unused")
                                  int c4 = 0;
                                  while (f4)
                                  {
                                    rule = Rule_SP.parse(context);
                                    if ((f4 = rule != null))
                                    {
                                      e4.add(rule);
                                      c4++;
                                    }
                                  }
                                  parsed = true;
                                }
                                if (parsed)
                                {
                                  boolean f4 = true;
                                  int c4 = 0;
                                  for (int i4 = 0; i4 < 1 && f4; i4++)
                                  {
                                    rule = Rule_PIPE.parse(context);
                                    if ((f4 = rule != null))
                                    {
                                      e4.add(rule);
                                      c4++;
                                    }
                                  }
                                  parsed = c4 == 1;
                                }
                                if (parsed)
                                  e3.addAll(e4);
                                else
                                  context.index = s4;
                              }
                            }
                            f3 = context.index > g3;
                            if (parsed) c3++;
                          }
                          parsed = c3 == 1;
                        }
                        if (parsed)
                          e2.addAll(e3);
                        else
                          context.index = s3;
                      }
                    }
                    if (!parsed)
                    {
                      {
                        ArrayList<Rule> e3 = new ArrayList<Rule>();
                        int s3 = context.index;
                        parsed = true;
                        if (parsed)
                        {
                          boolean f3 = true;
                          int c3 = 0;
                          for (int i3 = 0; i3 < 1 && f3; i3++)
                          {
                            int g3 = context.index;
                            parsed = false;
                            if (!parsed)
                            {
                              {
                                ArrayList<Rule> e4 = new ArrayList<Rule>();
                                int s4 = context.index;
                                parsed = true;
                                if (parsed)
                                {
                                  boolean f4 = true;
                                  int c4 = 0;
                                  for (int i4 = 0; i4 < 1 && f4; i4++)
                                  {
                                    rule = Rule_intVal.parse(context);
                                    if ((f4 = rule != null))
                                    {
                                      e4.add(rule);
                                      c4++;
                                    }
                                  }
                                  parsed = c4 == 1;
                                }
                                if (parsed)
                                {
                                  boolean f4 = true;
                                  @SuppressWarnings("unused")
                                  int c4 = 0;
                                  while (f4)
                                  {
                                    rule = Rule_SP.parse(context);
                                    if ((f4 = rule != null))
                                    {
                                      e4.add(rule);
                                      c4++;
                                    }
                                  }
                                  parsed = true;
                                }
                                if (parsed)
                                {
                                  boolean f4 = true;
                                  int c4 = 0;
                                  for (int i4 = 0; i4 < 1 && f4; i4++)
                                  {
                                    rule = Rule_PIPE.parse(context);
                                    if ((f4 = rule != null))
                                    {
                                      e4.add(rule);
                                      c4++;
                                    }
                                  }
                                  parsed = c4 == 1;
                                }
                                if (parsed)
                                  e3.addAll(e4);
                                else
                                  context.index = s4;
                              }
                            }
                            f3 = context.index > g3;
                            if (parsed) c3++;
                          }
                          parsed = c3 == 1;
                        }
                        if (parsed)
                          e2.addAll(e3);
                        else
                          context.index = s3;
                      }
                    }
                    if (!parsed)
                    {
                      {
                        ArrayList<Rule> e3 = new ArrayList<Rule>();
                        int s3 = context.index;
                        parsed = true;
                        if (parsed)
                        {
                          boolean f3 = true;
                          int c3 = 0;
                          for (int i3 = 0; i3 < 1 && f3; i3++)
                          {
                            int g3 = context.index;
                            parsed = false;
                            if (!parsed)
                            {
                              {
                                ArrayList<Rule> e4 = new ArrayList<Rule>();
                                int s4 = context.index;
                                parsed = true;
                                if (parsed)
                                {
                                  boolean f4 = true;
                                  int c4 = 0;
                                  for (int i4 = 0; i4 < 1 && f4; i4++)
                                  {
                                    rule = Rule_strVal.parse(context);
                                    if ((f4 = rule != null))
                                    {
                                      e4.add(rule);
                                      c4++;
                                    }
                                  }
                                  parsed = c4 == 1;
                                }
                                if (parsed)
                                {
                                  boolean f4 = true;
                                  @SuppressWarnings("unused")
                                  int c4 = 0;
                                  while (f4)
                                  {
                                    rule = Rule_SP.parse(context);
                                    if ((f4 = rule != null))
                                    {
                                      e4.add(rule);
                                      c4++;
                                    }
                                  }
                                  parsed = true;
                                }
                                if (parsed)
                                {
                                  boolean f4 = true;
                                  int c4 = 0;
                                  for (int i4 = 0; i4 < 1 && f4; i4++)
                                  {
                                    rule = Rule_PIPE.parse(context);
                                    if ((f4 = rule != null))
                                    {
                                      e4.add(rule);
                                      c4++;
                                    }
                                  }
                                  parsed = c4 == 1;
                                }
                                if (parsed)
                                  e3.addAll(e4);
                                else
                                  context.index = s4;
                              }
                            }
                            f3 = context.index > g3;
                            if (parsed) c3++;
                          }
                          parsed = c3 == 1;
                        }
                        if (parsed)
                          e2.addAll(e3);
                        else
                          context.index = s3;
                      }
                    }
                    if (!parsed)
                    {
                      {
                        ArrayList<Rule> e3 = new ArrayList<Rule>();
                        int s3 = context.index;
                        parsed = true;
                        if (parsed)
                        {
                          boolean f3 = true;
                          int c3 = 0;
                          for (int i3 = 0; i3 < 1 && f3; i3++)
                          {
                            int g3 = context.index;
                            parsed = false;
                            if (!parsed)
                            {
                              {
                                ArrayList<Rule> e4 = new ArrayList<Rule>();
                                int s4 = context.index;
                                parsed = true;
                                if (parsed)
                                {
                                  boolean f4 = true;
                                  int c4 = 0;
                                  for (int i4 = 0; i4 < 1 && f4; i4++)
                                  {
                                    rule = Rule_emptyVal.parse(context);
                                    if ((f4 = rule != null))
                                    {
                                      e4.add(rule);
                                      c4++;
                                    }
                                  }
                                  parsed = c4 == 1;
                                }
                                if (parsed)
                                {
                                  boolean f4 = true;
                                  @SuppressWarnings("unused")
                                  int c4 = 0;
                                  while (f4)
                                  {
                                    rule = Rule_SP.parse(context);
                                    if ((f4 = rule != null))
                                    {
                                      e4.add(rule);
                                      c4++;
                                    }
                                  }
                                  parsed = true;
                                }
                                if (parsed)
                                {
                                  boolean f4 = true;
                                  int c4 = 0;
                                  for (int i4 = 0; i4 < 1 && f4; i4++)
                                  {
                                    rule = Rule_PIPE.parse(context);
                                    if ((f4 = rule != null))
                                    {
                                      e4.add(rule);
                                      c4++;
                                    }
                                  }
                                  parsed = c4 == 1;
                                }
                                if (parsed)
                                  e3.addAll(e4);
                                else
                                  context.index = s4;
                              }
                            }
                            f3 = context.index > g3;
                            if (parsed) c3++;
                          }
                          parsed = c3 == 1;
                        }
                        if (parsed)
                          e2.addAll(e3);
                        else
                          context.index = s3;
                      }
                    }
                    f2 = context.index > g2;
                    if (parsed) c2++;
                  }
                  parsed = c2 == 1;
                }
                if (parsed)
                  e1.addAll(e2);
                else
                  context.index = s2;
              }
            }
            f1 = context.index > g1;
            if (parsed) c1++;
          }
          parsed = true;
        }
        if (parsed)
        {
          boolean f1 = true;
          @SuppressWarnings("unused")
          int c1 = 0;
          while (f1)
          {
            rule = Rule_SP.parse(context);
            if ((f1 = rule != null))
            {
              e1.add(rule);
              c1++;
            }
          }
          parsed = true;
        }
        if (parsed)
        {
          boolean f1 = true;
          int c1 = 0;
          for (int i1 = 0; i1 < 1 && f1; i1++)
          {
            rule = Rule_CRL_BRACKET_R.parse(context);
            if ((f1 = rule != null))
            {
              e1.add(rule);
              c1++;
            }
          }
          parsed = c1 == 1;
        }
        if (parsed)
          e0.addAll(e1);
        else
          context.index = s1;
      }
    }

    rule = null;
    if (parsed)
      rule = new Rule_definition(context.text.substring(s0, context.index), e0);
    else
      context.index = s0;

    context.pop("definition", parsed);

    return (Rule_definition)rule;
  }
}

/* -----------------------------------------------------------------------------
 * eof
 * -----------------------------------------------------------------------------
 */
